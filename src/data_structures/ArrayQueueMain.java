package data_structures;

public class ArrayQueueMain {
    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray(20);

        for (int i = 1 ; i < 5; i++) {
            queueUsingArray.add(i);
        }

        queueUsingArray.printElements();

        for (int i = 1 ; i <= 5; i++) {
            queueUsingArray.remove();
            queueUsingArray.printElements();
        }
    }
}
