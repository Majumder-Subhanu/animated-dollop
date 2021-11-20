package Recursion;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decitobin(n);
    }

    private static void decitobin(int n) {
        if (n <= 1) System.out.print(n);
        else {
            decitobin(n/2);
            System.out.print(n % 2);
        }
    }
}
