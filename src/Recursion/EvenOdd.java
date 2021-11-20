package Recursion;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean val = is_even_odd(n);
        if (val) System.out.printf("%d is even\n", n);
        else System.out.printf("%d is odd\n", n);
    }

    private static boolean is_even_odd(int n) {
        if (n == 2) return true;
        else if (n == 1) return false;
        else return is_even_odd(n - 2);
    }
}
