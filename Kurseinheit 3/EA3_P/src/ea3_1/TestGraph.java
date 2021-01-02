package ea3_1;

public class TestGraph {
    public static void main(String[] args) throws Exception {
        Graph testingGraph1 = new Graph(5);

        testingGraph1.getNode(4);

        String[] Nodes = {"Polen","Tschechien","Ungarn","Slowakei","Ukraine","Russland","Oesterreich"};

        Graph testingGraph2 = new Graph(Nodes);

        testingGraph1.setNodes(Nodes);

        System.out.println("I expect 0 and it is: " + testingGraph1.indexOf("Polen"));
        System.out.println();
        System.out.println();
        System.out.println("I expect 6 and it is: " + testingGraph2.indexOf("Oesterreich"));
        System.out.println();
        System.out.println();
        System.out.println("Laenge der Liste ist: " + Nodes.length);
        System.out.println();
        System.out.println();
        System.out.println("I expect Polen and it is: " + testingGraph1.getNode(0));
        System.out.println();
        System.out.println();
        System.out.println("I expect Oesterreich and it is: " + testingGraph2.getNode(6));
        System.out.println();
        System.out.println();
        System.out.println("testingGraph1 length is expected to be 5 and is: " + testingGraph1.getNumberOfNodes());
        System.out.println();
        System.out.println();
        System.out.println("testingGraph2 length is expected to be 7 and is: " + testingGraph2.getNumberOfNodes());
        System.out.println();
        System.out.println();
        String[] NeueLaendern1 = {"Land1_1","Land2_1","Land3_1","Land4_1"};
        String[] NeueLaendern2 = {"Land1_2","Land2_2","Land3_2","Land4_2"};
        testingGraph1.setNodes(NeueLaendern1);
        testingGraph2.setNodes(NeueLaendern2);
        System.out.println();
        System.out.println();
        System.out.println("Das sind neue Laendern fuer testingGraph1");
        for (int i = 0; i < testingGraph1.getNumberOfNodes(); i++) {
            System.out.print(testingGraph1.nodes[i] + " ");
        }
            System.out.println();
            System.out.println();
            System.out.println("Das sind neue Laendern fuer testingGraph2");
            for (int k = 0; k < testingGraph2.getNumberOfNodes(); k++) {
                System.out.print(testingGraph2.nodes[k] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("expected false and is: " + testingGraph1.isAdjacent(1,3));
        System.out.println();
        System.out.println();
        System.out.println("expected false and is: " + testingGraph2.isAdjacent(1,3));
        System.out.println();
        System.out.println();
        System.out.println("expected false and is: " + testingGraph1.isAdjacent("Land1_1","Land3_1"));
        System.out.println();
        System.out.println();
        System.out.println("expected false and is: " + testingGraph2.isAdjacent("Land1_2","Land3_2"));
        System.out.println();
        System.out.println();
        testingGraph1.addEdge(1,3);
        testingGraph2.addEdge(1,3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("expected true and is: " + testingGraph1.isAdjacent(1,3));
        System.out.println();
        System.out.println();
        System.out.println("expected true and is: " + testingGraph2.isAdjacent(1,3));
        System.out.println();
        System.out.println();
        System.out.println("expected true and is: " + testingGraph1.isAdjacent("Land2_1","Land4_1"));
        System.out.println();
        System.out.println();
        System.out.println("expected true and is: " + testingGraph2.isAdjacent("Land2_2","Land4_2"));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("expected false and is: " + testingGraph1.isAdjacent(2,4));
        System.out.println();
        System.out.println();
        System.out.println("expected false and is: " + testingGraph2.isAdjacent(2,4));
        System.out.println();
        System.out.println();
        System.out.println("expected false and is: " + testingGraph1.isAdjacent("Land3_1","Ukraine"));
        System.out.println();
        System.out.println();
        System.out.println("expected false and is: " + testingGraph2.isAdjacent("Land3_2","Ukraine"));
        System.out.println();
        System.out.println();
        testingGraph1.addEdge("Land3_1","Ukraine");
        testingGraph2.addEdge("Land3_2","Ukraine");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("expected true and is: " + testingGraph1.isAdjacent(2,4));
        System.out.println();
        System.out.println();
        System.out.println("expected true and is: " + testingGraph2.isAdjacent(2,4));
        System.out.println();
        System.out.println();
        System.out.println("expected true and is: " + testingGraph1.isAdjacent("Land3_1","Ukraine"));
        System.out.println();
        System.out.println();
        System.out.println("expected true and is: " + testingGraph2.isAdjacent("Land3_2","Ukraine"));



    }
}
