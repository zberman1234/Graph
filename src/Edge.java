
public class Edge {
    private Node start, end;
    public Edge(Node n1, Node n2) {
        start = n1;
        end = n2;
    }

    public String toString() {
        return start.toString() + " --> " + end.toString();
    }
}
