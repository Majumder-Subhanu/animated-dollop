package Recursion;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n :: ");
        int n = sc.nextInt();
        display_natural(n);
    }

    private static void display_natural(int n) {
        if (n == 1) System.out.print(n + "  ");
        else {
            display_natural(n - 1);
            System.out.print(n + "  ");
        }
    }
}
