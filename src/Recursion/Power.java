package Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int power = power_of_n(m, n);
        System.out.printf("%d to the power %d is %d", m, n, power);
    }

    private static int power_of_n(int m, int n) {
        if (n == 1) return m;
        else {
            m *= m;
            n -= 1;
            return power_of_n(m, n);
        }
    }
}
