public class BinarySearchTree {
    private BinaryTreeNode root;

    public BinarySearchTree() {
        // initialise an empty tree
        root = null;
    }

    public void add(int value) {
        // add a new node while preserving BST property

        // create the new node
        BinaryTreeNode nodeToAdd = new BinaryTreeNode(value);

        // place it at the correct position
        if(root == null) { // case where tree is empty
            root = nodeToAdd;
            return;
        }

        BinaryTreeNode currentNode = root;  // always start from the root!
        boolean finished = false;
        while (!finished) {
            if (nodeToAdd.getValue() < currentNode.getValue()) {
                // follow the left branch, if there is one
                if (currentNode.getLeftChild() != null) {
                    currentNode = currentNode.getLeftChild();
                } else {
                    // new node belongs here
                    currentNode.setLeftChild(nodeToAdd);
                    finished = true;
                }
            } else {
                // follow the right branch, if there is one
                if (currentNode.getRightChild() != null) {
                    currentNode = currentNode.getRightChild();
                } else {
                    // new node belongs here
                    currentNode.setRightChild(nodeToAdd);
                    finished = true;
                }
            }
        }
    }

    public void display() {
        // print out all the nodes using LNR traversal
        traverseInOrder(root);
        System.out.println();
    }

    public void traverseInOrder(BinaryTreeNode node) {
        // print out the nodes, using LNR traversal

        // left branch
        if(node.getLeftChild() != null) {
            traverseInOrder(node.getLeftChild());
        }

        // node value
        System.out.print(node.getValue() + ", ");

        // right branch
        if(node.getRightChild() != null) {
            traverseInOrder(node.getRightChild());
        }
    }
}
