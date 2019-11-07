package week1;

import java.util.Scanner;

public class NearHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int next = scanner.nextInt();
    }

    private boolean nearHundred(int n) {
        return Math.abs((100 - n)) <= 10;
    }
}
