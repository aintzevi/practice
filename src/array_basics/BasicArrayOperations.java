package array_basics;

import java.util.Random;

public class BasicArrayOperations {

/*    public static void main(String[] args) {
        System.out.println("Create random array");
        int n = 3;

        int[] a = createRandomArray(n);
        printArray(a);
    }*/

    /*
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(binarySearch(a, 0, 8, 5));
        System.out.println(binarySearch(a, 0, 8, 7));
        System.out.println(binarySearch(a, 0, 8, 9));
        System.out.println(binarySearch(a, 0, 8, 10));
        System.out.println(binarySearch(a, 0, 8, 1));
    }*/

    public static int[] createRandomArray(int n) {
        int[] a = new int[n];
        Random randomGenerator = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = randomGenerator.nextInt(100);
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean binarySearch(int[] sortedArray, int startIndex, int stopIndex, int value) {
        int midIndex;
        if (stopIndex > startIndex) {
            midIndex = stopIndex - startIndex / 2;
            if (value == sortedArray[midIndex])
                return true;
            else if (value < sortedArray[midIndex]) {
                return binarySearch(sortedArray, startIndex, midIndex - 1, value);
            } else if (value > sortedArray[midIndex]) {
                binarySearch(sortedArray, midIndex + 1, stopIndex, value);
            }
        }
        return false;
    }
}
