package ea2_3;

class BinaryNode {
    private BinaryNode leftSon, rightSon;
    private int value;

    public BinaryNode(int v) {
        value = v;
    }

    public boolean contains(int v) {
        if (value == v) {
            return true;
        } else if (leftSon != null & v <= leftSon.value) {
            leftSon.contains(v);
        } else if (rightSon != null) {
            rightSon.contains(v);
        }
        return false;
    }

    public void insert(int v) { /* s. b) ... */ }

    public void inorder() { /* s. c) ... */ }
}

