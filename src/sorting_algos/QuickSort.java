package sorting_algos;

import array_basics.BasicArrayOperations;

public class QuickSort {
    public static void main(String[] args) {
//        int arrayLength = 10;
//        int a[] = ArrayBasicOperations.createRandomArray(arrayLength);
        int[] a = {-30, 40, 15, -35, 40, 30, -10,0, 20};
        QuickSort.quicksort(a, 0, a.length);
        BasicArrayOperations.printArray(a);
    }

    private static void quicksort(int array[], int low, int high) {
        int pi;
        if ( low < high) {
            pi = partition(array, low, high);

            quicksort(array, low, pi);
            quicksort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[low];

        int i = low;

        for (int j = i + 1; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                BasicArrayOperations.swap(array, i, j);
            }
        }
        BasicArrayOperations.swap(array, low, i);
        return i;
    }
}
