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
            if(frontIndex > 0) {
                // shift values backward and update front and rear index
                int numberOfElements = rearIndex - frontIndex + 1;
                for (int i = 0 ; i < numberOfElements ; i++) {
                    queue[i] = queue[frontIndex + i];
                }
                frontIndex = 0;
                rearIndex = numberOfElements;
            }
            else {
                System.out.println("No space left for new values!");
                // TODO: Update so that the array gets "bigger"
            }
        }
    }

    public int remove() {
        int currentFront = queue[frontIndex];
        if(frontIndex < size - 1)
            frontIndex++;

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
