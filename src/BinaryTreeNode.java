public class BinaryTreeNode {
    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public BinaryTreeNode getLeftChild() {
        return left;
    }

    public BinaryTreeNode getRightChild() {
        return right;
    }

    void setLeftChild(BinaryTreeNode left) {
        this.left = left;
    }

    void setRightChild(BinaryTreeNode right) {
        this.right = right;
    }
}
