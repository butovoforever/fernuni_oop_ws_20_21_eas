package ea2_3;

class BinaryNode {
    BinaryNode leftSon, rightSon;
    int value;
//    private BinaryNode leftSon, rightSon;
//    private int value;

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

    public void insert(int v) {
        if (Integer.toString(value) != null & value != v) {
            if (v < value) {
                if(Integer.toString(leftSon.value) != null) {
                 leftSon.insert(v);
                } else {
                    leftSon.value = v;
                }
            } else {

            }
        }
    }

    public void inorder() { /* s. c) ... */ }
}

