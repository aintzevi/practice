package data_structures;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node currentNode, int value) {
        if (currentNode == null)
            return new Node(value);

        if (currentNode.getValue() > value)
            currentNode.setPrevious(addRecursive(currentNode.getPrevious(), value));
        else if (currentNode.getValue() < value)
            currentNode.setNext(addRecursive(currentNode.getNext(), value));
        else
            return currentNode;
        return currentNode;
    }

    public boolean contains(int value) {
        return findRecursive(root, value);
    }

    private boolean findRecursive(Node currentNode, int value) {
        while (currentNode != null) {
            if (currentNode.getValue() > value) {
                currentNode = currentNode.getPrevious();
                findRecursive(currentNode, value);
            } else if (currentNode.getValue() < value) {
                currentNode = currentNode.getNext();
                findRecursive(currentNode, value);
            } else {
                return true;
            }
        }
        return false;
    }

    public Node delete(int value) {
        return deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node currentNode, int value) {

        if (currentNode.getValue() > value) {
            currentNode = currentNode.getPrevious();
            currentNode = deleteRecursive(currentNode.getPrevious(), value);
        } else if (currentNode.getValue() < value) {
            currentNode = currentNode.getNext();
            currentNode = deleteRecursive(currentNode.getNext(), value);
        } else {
            // Make changes in the tree
            if (currentNode.getPrevious() == null && currentNode.getNext() == null) {
                return null;
            } else if (currentNode.getPrevious() == null) {
                return currentNode.getNext();
            } else if (currentNode.getNext() == null) {
                return currentNode.getPrevious();
            } else {
                return currentNode.getPrevious().getValue() < currentNode.getNext().getValue() ? currentNode.getPrevious() : currentNode.getNext();
            }
        }
        return null;
    }

    public void dfsTraversal (Node currentNode) {
        if (currentNode == null)
            return;

        dfsTraversal(currentNode.getPrevious());

        System.out.print(currentNode.getValue() + " ");

        dfsTraversal(currentNode.getNext());
    }

    // TODO BFS traversal
}
