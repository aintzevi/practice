package sorting_algos;

import array_basics.BasicArrayOperations;

public class SelectionSort {
    // SelectionSort picks the minimum element and sets it to its correct place every time
    public static void main(String[] args) {
        // Create array of integers
//        int arrayLength = 10;
//        int[] a = BasicArrayOperations.createRandomArray(arrayLength);
        int[] a = {20, 40, 10, 30};

        selectionSort(a);
        BasicArrayOperations.printArray(a);
    }

    private static void selectionSort(int[] array) {
        int min = array[0];
        int minIndex = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
            BasicArrayOperations.swap(array, minIndex, j);
        }
    }
}
