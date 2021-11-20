package Recursion;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int prod = multiply(n1, n2);
        System.out.printf("Product of %d and %d is %d", n1, n2, prod);
    }

    private static int multiply(int n1, int n2) {
        if (n2 == 1) return n1;
        else {
            n1 += n1;
            n2 -= 1;
            return multiply(n1, n2);
        }
    }
}
