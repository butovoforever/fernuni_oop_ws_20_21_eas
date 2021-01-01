package ea2_3;

import java.sql.SQLOutput;

class BinaryNode {
//    BinaryNode leftSon, rightSon;
//    int value;
    private BinaryNode leftSon, rightSon;
    private int value;

    public BinaryNode(int v) {
        value = v;
    }

    public boolean contains(int v) {
        if (value == v) {
            return true;
//        } else if (leftSon != null & v <= leftSon.value) {
//            leftSon.contains(v);
//        } else if (rightSon != null) {
//            rightSon.contains(v);
//        }

//        } else {
//            leftSon.contains(v);
//            rightSon.contains(v);
//        }

        } else if (leftSon != null & v < value) {
//            System.out.println(leftSon.value);
//            System.out.println(v == leftSon.value);
            return leftSon.contains(v);
        } else if (rightSon != null) {
//            System.out.println(rightSon.value);
//            System.out.println(v == rightSon.value);
            return rightSon.contains(v);
        }

        return false;
    }

    public void insert(int v) {
        if (value != v) {
            if (v < value) {
                if(leftSon != null) {
                 leftSon.insert(v);
                } else {
                    leftSon = new BinaryNode(v);
                }
            } else {
                if(rightSon != null) {
                    rightSon.insert(v);
                } else {
                    rightSon = new BinaryNode(v);
                }
            }
        }
    }

    public void inorder() {
        //BinaryNode Helper = this;
        if (leftSon != null) {
            leftSon.inorder();
            System.out.println(value);
            if (rightSon != null) {
                rightSon.inorder();
            }
        } else {
            System.out.println(value);
            if (rightSon != null) {
                rightSon.inorder();
            }
        }



    }
}

