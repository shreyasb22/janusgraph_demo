package org.example;

import org.apache.tinkerpop.gremlin.driver.remote.DriverRemoteConnection;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import static org.apache.tinkerpop.gremlin.process.traversal.AnonymousTraversalSource.traversal;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Throwable {
        try {
            GraphTraversalSource g = traversal().withRemote(DriverRemoteConnection.using("localhost", 8182));

            JanusGraphTransactionListener transactionListener = new JanusGraphTransactionListener(g);

            System.out.println("Register Listener");
            System.out.println("Transaction will begin soon");
            Object result = g.addV("person").property("name", "shreyas").next();
            System.out.println("Result: " + result);
            System.out.println("Entering commit phase");
            transactionListener.commit();
            System.out.println("Entering close phase");
            transactionListener.close();

        } catch (Exception e) {
            System.out.println("Exception: " + e.getCause());
            throw e.getCause();
        }
    }
}

