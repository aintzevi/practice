package data_structures;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;
    private int size;

    public QueueUsingLinkedList() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty () {
        return front.equals(rear);
    }

    public void add (Node newNode) {

    }

    public Node delete () {
        return null;
    }

    public Node peek() {
        return front;
    }

    public void printAll() {

    }
}
