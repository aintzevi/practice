package data_structures;

public class QueueUsingArray {
    private int[] queue;
    private int frontIndex;
    private int rearIndex;
    private int size;

    QueueUsingArray () {
        queue = new int[10];
        frontIndex = rearIndex = 0;
        size = 0;
    }

    QueueUsingArray (int size) {
        this.size = size;
        queue = new int[size];
        frontIndex = rearIndex = 0;
    }

    public int getFrontIndex() {
        return frontIndex;
    }

    public void setFrontIndex(int frontIndex) {
        this.frontIndex = frontIndex;
    }

    public int getRearIndex() {
        return rearIndex;
    }

    public void setRearIndex(int rearIndex) {
        this.rearIndex = rearIndex;
    }

    public int getSize() {
        return size;
    }

    /*

        public int[] getQueue() {
            return queue;
        }

        public void setQueue(int[] queue) {
            this.queue = queue;
        }

    */
    public void add(int value) {
        if(rearIndex < size){
            queue[rearIndex] = value;
            rearIndex++;
        }
        else {
            //TODO check if full => print message or if needs to shift (frontIndex > 0)
        }
    }

    public int remove() {
        int currentFront = queue[frontIndex];
        if(frontIndex < size - 1)
            frontIndex++;
//        else
//            // TODO Move items on else or print message

        return currentFront;
    }

    public boolean isEmpty() {
        return frontIndex == rearIndex;
    }

    public void printElements () {
        for (int i = frontIndex ; i < rearIndex--; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
