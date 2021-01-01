package ea3_1;

public class TestGraph {
    public static void main(String[] args) throws Exception {
        Graph testingGraph = new Graph(2);
        testingGraph.nodes[0] = ("a");
        testingGraph.nodes[1] = ("a");
        try {
            testingGraph.getNode(25);
        } catch (GraphException e) {
            System.out.println("bad index");
        }



    }
}
