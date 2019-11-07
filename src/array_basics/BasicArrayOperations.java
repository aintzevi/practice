package array_basics;

import java.util.Random;

public class BasicArrayOperations {

/*    public static void main(String[] args) {
        System.out.println("Create random array");
        int n = 3;

        int[] a = createRandomArray(n);
        printArray(a);
    }*/

    public static int[] createRandomArray(int n) {
        int a[] = new int[n];
        Random randomGenerator = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = randomGenerator.nextInt(100);
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
