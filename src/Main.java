import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Node fNode = new Node(12);
        Node sNode = new Node(34);

        Edge fEdge = new Edge(fNode, sNode);

        HashSet<Node> Nodes = new HashSet<Node>();
        HashSet<Edge> Edges = new HashSet<Edge>();

        Nodes.add(fNode);
        Nodes.add(sNode);

        Edges.add(fEdge);

        Graph fGraph = new Graph(Nodes, Edges);

        

        System.out.println(fGraph);

    }
}
