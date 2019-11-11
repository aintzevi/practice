package data_structures;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;
    private int size;

    QueueUsingLinkedList() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty () {
        return front.equals(rear);
    }

    public void add (Node newNode) {
        rear.setNext(newNode);
        newNode = rear;
    }

    public Node remove () {
        Node currentFront = front;
        front = front.getNext();
        front.setPrevious(null);
        return currentFront;
    }

    public Node peek() {
        return front;
    }

    public void printAll() {
        Node current = front;

        while (current.getNext() != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
