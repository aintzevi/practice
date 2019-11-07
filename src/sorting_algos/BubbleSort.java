package sorting_algos;

import array_basics.BasicArrayOperations;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] array = {8, 1, 5, 2, 3, 6, 1};
        int arraySize = 50;
        int[] array = BasicArrayOperations.createRandomArray(50);

        bubbleSort(array);
        BasicArrayOperations.printArray(array);
    }

    //TODO Break when no more swaps left
    static void bubbleSort(int[] array) {
        int arraySize = array.length;
        for (int j = 0 ; j < arraySize ; j++) {
            for (int i = 0; i < arraySize - 1; i++) {
                if (array[i + 1] < array[i]) {
                    BasicArrayOperations.swap(array, i, i + 1);
                }
            }
        }
    }
}
