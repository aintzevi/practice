package data_structures;

public class ListQueueMain {
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        for (int i = 1; i <= 4; i++) {
            Node newNode = new Node(i);
            queue.add(newNode);
        }
        queue.printAll();
        System.out.println("Delete one by one");
        while(!queue.isEmpty()) {
            queue.remove();
            queue.printAll();
        }
    }
}
