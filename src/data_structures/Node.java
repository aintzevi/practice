package data_structures;

public class Node {
    private Node previous;
    private Node next;
    private int value;

    // Default constructor
    public Node() {

    }

    public Node(int value) {
        this.value = value;
    }

    public Node(Node next, Node previous, int value) {
        this.previous = previous;
        this.next = next;
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void printNode() {
        System.out.println(this.value);
    }
}
