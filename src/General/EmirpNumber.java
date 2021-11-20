package General;

import java.util.Scanner;

public class EmirpNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (is_prime(n) || is_prime(reverse(n))) {
            System.out.println("OOP_Concepts.Emirp number");
        } else {
            System.out.println("Not an emirp number");
        }
    }

    private static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        return rev;
    }

    private static boolean is_prime(int n) {
        return n == 2 || Math.pow(2, n - 1) % n == 1;
    }

}
