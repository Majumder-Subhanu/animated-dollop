package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = find_fact(n);
        System.out.printf("Factorial of %d is %d\n", n, fact);
    }

    private static int find_fact(int n) {
        if (n <= 2) return n;
        else return n * find_fact(n-1);
    }
}
