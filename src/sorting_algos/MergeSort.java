package sorting_algos;

import array_basics.BasicArrayOperations;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {1, 5, 23, 6, 3, 1, 5, 3, 2};

//        int arraySize = 50;
//        int[] array = BasicArrayOperations.createRandomArray(50);

        BasicArrayOperations.printArray(array);
    }

    // Call merge sort with the array, high and low index
    // Create 2 half arrays
    // Call merge sort with the split array parts
    // Check if number of elements is < 3 (therefore 1 or 2 elements only)
    // If this happens, have 2 counters i, j in both the arrays
    // Pick the one that is smaller everytime. If one array is finished, just copy the rest of the other array (no reason for extra check)
    static void mergeSort(int[] array, int start, int end) {
        int splitIndex = (end - start) / 2;
        // TODO Split the index if odd/even
        while(end > start) {
            mergeSort(array, start, splitIndex);
        }
    }

    static void merge (int[]  array1, int[]  array2) {
        int i = 0, j = 0;

        // TODO Add check for the array sizes

        int size = array1.length + array2.length;
        int[] mergedArray = new int[size];

        for (int k = 0 ; k < size ; k++) {
            if (array1[i] < array2[j]){
                mergedArray[k] = array1[i];
            }
            else {
                mergedArray[k] = array2[j];
            }
        }
    }
}
