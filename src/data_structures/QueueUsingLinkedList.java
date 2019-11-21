package data_structures;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;
    private static int size;

    static int getSize() {
        return size;
    }

    QueueUsingLinkedList() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return front == null && rear == null;
    }

    void add(Node newNode) {

        if (isEmpty())
            front = rear = newNode;
        else if (front == rear) {
            rear = newNode;
            front.setNext(rear);
            rear.setPrevious(front);
        } else {
            Node temp = rear;
            rear = newNode;
            rear.setPrevious(temp);
        }
        size++;
    }

    public Node remove() {
        Node currentFront = front;
        front = front.getNext();
        front.setPrevious(null);
        return currentFront;
    }

    public Node peek() {
        return front;
    }

    void printAll() {
        Node current = front;

        while (current.getNext() != rear) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
