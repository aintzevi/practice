package data_structures;

/**
 * Queue implementation using array
 */

public class QueueUsingArray {
    private int[] queue;
    private int frontIndex;
    private int rearIndex;
    private int size;

    /**
     * Initializes array of size 10
     */
    QueueUsingArray () {
        queue = new int[10];
        frontIndex = rearIndex = 0;
        size = 0;
    }

    /**
     * Initializes array of desired size
     */
    QueueUsingArray (int size) {
        this.size = size;
        queue = new int[size];
        frontIndex = rearIndex = 0;
    }

    /**
     * @return Capacity of queue
     */
    public int getSize() {
        return size;
    }

    /**
     * Adds number in the queue, given that the queue is not full
     * @param value number to be added in the queue
     */
    public void add(int value) {
        if(rearIndex < size - 1){
            queue[rearIndex] = value;
            rearIndex++;
        }
        else {
            // shift values backward and update front and rear index
            if(frontIndex > 0) {
                int numberOfElements = rearIndex - frontIndex + 1;
                for (int i = 0 ; i < numberOfElements ; i++) {
                    System.arraycopy(queue, frontIndex + i, queue, i, numberOfElements );
                }

                frontIndex = 0;
                rearIndex = numberOfElements;
            }
            else {
                System.out.println("No space left for new values!");
                // TODO: Update to extending array
            }
        }
    }

    /**
     * Remove top item from the queue
     * @return the top number of the queue
     */
    public int remove() {
        int currentFront = queue[frontIndex];
        if(frontIndex < size - 1 && frontIndex < rearIndex)
            frontIndex++;
        else {
            System.out.println("Queue is empty");
        }
        size--;
        return currentFront;
    }

    /**
     *
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return frontIndex == rearIndex;
    }

    /**
     * Prints the items inside the queue in a line
     */
    public void printElements () {
        for (int i = frontIndex ; i < rearIndex; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
