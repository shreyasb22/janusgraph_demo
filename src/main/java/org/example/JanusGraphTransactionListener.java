package org.example;
import org.apache.commons.configuration2.Configuration;
import org.apache.tinkerpop.gremlin.process.computer.GraphComputer;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Transaction;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.janusgraph.core.*;
import org.janusgraph.core.schema.EdgeLabelMaker;
import org.janusgraph.core.schema.PropertyKeyMaker;
import org.janusgraph.core.schema.VertexLabelMaker;
import org.janusgraph.graphdb.relations.RelationIdentifier;

import java.util.Collection;
import java.util.Iterator;

public class JanusGraphTransactionListener implements JanusGraphTransaction {

    private GraphTraversalSource graph;

    public JanusGraphTransactionListener(GraphTraversalSource g) {
        graph = g;
    }

    @Override
    public JanusGraphVertex addVertex(Long aLong, VertexLabel vertexLabel) {
        return null;
    }

    @Override
    public JanusGraphVertex getVertex(long l) {
        return null;
    }

    @Override
    public Iterable<JanusGraphVertex> getVertices(long... longs) {
        return null;
    }

    @Override
    public Iterable<JanusGraphEdge> getEdges(RelationIdentifier... relationIdentifiers) {
        return null;
    }

    @Override
    public void commit() {
        System.out.println("Transaction Commit");
        //Before commit blocking validation
        /////////////////////////
        graph.tx().commit();
        ////////////////////////
        //After commit cleanup function
    }

    @Override
    public void rollback() {
        System.out.println("Transaction Rollback");
        graph.tx().rollback();
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public boolean hasModifications() {
        return false;
    }

    @Override
    public void expireSchemaElement(long l) {

    }

    @Override
    public JanusGraphVertex addVertex(String s) {
        return null;
    }

    @Override
    public <C extends GraphComputer> C compute(Class<C> graphComputerClass) throws IllegalArgumentException {
        return null;
    }

    @Override
    public GraphComputer compute() throws IllegalArgumentException {
        return null;
    }

    @Override
    public Iterator<Vertex> vertices(Object... vertexIds) {
        return null;
    }

    @Override
    public Iterator<Edge> edges(Object... edgeIds) {
        return null;
    }

    @Override
    public Transaction tx() {
        return null;
    }

    @Override
    public JanusGraphVertex addVertex(Object... objects) {
        return null;
    }

    @Override
    public JanusGraphQuery<? extends JanusGraphQuery> query() {
        return null;
    }

    @Override
    public MixedIndexCountQuery mixedIndexCountQuery() {
        return null;
    }

    @Override
    public JanusGraphIndexQuery indexQuery(String s, String s1) {
        return null;
    }

    @Override
    public JanusGraphMultiVertexQuery<? extends JanusGraphMultiVertexQuery> multiQuery(JanusGraphVertex... janusGraphVertices) {
        return null;
    }

    @Override
    public JanusGraphMultiVertexQuery<? extends JanusGraphMultiVertexQuery> multiQuery(Collection<JanusGraphVertex> collection) {
        return null;
    }

    @Override
    public void close() {
        graph.tx().close();
    }

    @Override
    public Variables variables() {
        return null;
    }

    @Override
    public Configuration configuration() {
        return null;
    }

    @Override
    public PropertyKeyMaker makePropertyKey(String s) {
        return null;
    }

    @Override
    public EdgeLabelMaker makeEdgeLabel(String s) {
        return null;
    }

    @Override
    public VertexLabelMaker makeVertexLabel(String s) {
        return null;
    }

    @Override
    public VertexLabel addProperties(VertexLabel vertexLabel, PropertyKey... propertyKeys) {
        return null;
    }

    @Override
    public EdgeLabel addProperties(EdgeLabel edgeLabel, PropertyKey... propertyKeys) {
        return null;
    }

    @Override
    public EdgeLabel addConnection(EdgeLabel edgeLabel, VertexLabel vertexLabel, VertexLabel vertexLabel1) {
        return null;
    }

    @Override
    public boolean containsRelationType(String s) {
        return false;
    }

    @Override
    public RelationType getRelationType(String s) {
        return null;
    }

    @Override
    public boolean containsPropertyKey(String s) {
        return false;
    }

    @Override
    public PropertyKey getOrCreatePropertyKey(String s) {
        return null;
    }

    @Override
    public PropertyKey getPropertyKey(String s) {
        return null;
    }

    @Override
    public boolean containsEdgeLabel(String s) {
        return false;
    }

    @Override
    public EdgeLabel getOrCreateEdgeLabel(String s) {
        return null;
    }

    @Override
    public EdgeLabel getEdgeLabel(String s) {
        return null;
    }

    @Override
    public boolean containsVertexLabel(String s) {
        return false;
    }

    @Override
    public VertexLabel getVertexLabel(String s) {
        return null;
    }

    @Override
    public VertexLabel getOrCreateVertexLabel(String s) {
        return null;
    }
}
