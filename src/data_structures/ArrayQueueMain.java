package data_structures;

public class ArrayQueueMain {
    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray(20);

        for (int i = 1 ; i <= queueUsingArray.getSize(); i++) {
            queueUsingArray.add(i);
        }

        queueUsingArray.printElements();
/*        System.out.println(queueUsingArray.getFrontIndex());
        System.out.println(queueUsingArray.getRearIndex());*/
    }
}
