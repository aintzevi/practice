package data_structures;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;
    private int size;
    private boolean isEmpty;

    QueueUsingLinkedList() {
        front = rear = null;
        size = 0;
        isEmpty = true;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    void add(Node newNode) {

        if (isEmpty) {
            front = rear = newNode;
            newNode.setPrevious(null);
            newNode.setNext(null);
        }

        else if (size == 1) {
            rear = newNode;
            front.setNext(newNode);
            newNode.setPrevious(front);
            newNode.setNext(null);
        } else {
            rear.setNext(newNode);
            newNode.setPrevious(rear);
            rear = newNode;
            rear.setPrevious(null);
        }
        size++;
        isEmpty = false;
    }

    public Node remove() {
        Node currentFront = front;
        front = front.getNext();
        if (front == null) {
            rear = null;
            isEmpty = true;
        }
        else {
            front.setPrevious(null);
        }

        return currentFront;
    }

    public Node peek() {
        return front;
    }

    void printAll() {
        Node current = front;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
        System.out.println("---------");
    }
}
