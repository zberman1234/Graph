import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Node> nodes;
    private Set<Edge> edges;

    public Graph(Set<Node> nodes, Set<Edge> edges) {
        this.nodes = new HashSet<Node>();
        this.edges = new HashSet<Edge>();

        for(Node e: nodes) this.nodes.add(e);
        for(Edge e: edges) this.edges.add(e);


    }

    public String toString() {
        String out = "A graph with nodes:\n ";
        for(Node n: nodes) out += n.toString() + ", ";
        out += "\nand edges:\n";
        for(Edge e: edges) out += e.toString() + ", ";
        out+="\n";
        return out;
    }
}
