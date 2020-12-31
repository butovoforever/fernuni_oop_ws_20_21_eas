package ea2_3;

public class TestTree {
    public static void main(String[] args) {
        BinaryNode myTree = new BinaryNode(6);
        myTree.insert(5);
        myTree.insert(4);
        myTree.insert(12);
        myTree.insert(11);
        myTree.insert(10);

//        myTree.inorder();
//        System.out.println();

//        System.out.println(myTree.value);
//        System.out.println(myTree.leftSon.value);
//        System.out.println(myTree.leftSon.leftSon.value);
//        System.out.println(myTree.rightSon.value);
//        System.out.println(myTree.rightSon.leftSon.value);
//        System.out.println(myTree.rightSon.leftSon.leftSon.value);

        System.out.println();
        System.out.println();
        System.out.println("6 " +myTree.contains(6));
        System.out.println();
        System.out.println();
        System.out.println("5 " +myTree.contains(5));
        System.out.println();
        System.out.println();
        System.out.println("4 " +myTree.contains(4));
        System.out.println();
        System.out.println();
        System.out.println("12 " +myTree.contains(12));
        System.out.println();
        System.out.println();
        System.out.println("11 " +myTree.contains(11));
        System.out.println();
        System.out.println();
        System.out.println("10 " +myTree.contains(10));


    }
}
