package misc;

import java.util.Scanner;

public class Difference21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = "";
        System.out.println("Give a number to calculate, or any other character to stop");
        next = sc.nextLine();
        while (next.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println(diff21(Integer.parseInt(next)));
            System.out.println("Pick a next");
            next = sc.nextLine();
        }
    }

    private static int diff21(int n) {
        return Math.abs(21 - n);
    }
}
