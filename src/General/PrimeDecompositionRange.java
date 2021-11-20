package General;

import java.util.Scanner;

public class PrimeDecompositionRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            prime_decomposition(i);
            System.out.println();
        }
    }

    private static void prime_decomposition(int n) {
        System.out.print( n + " = ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && is_prime(i)) {
                System.out.print(i + "  ");
                n /= i;
            }
        }
    }

    private static boolean is_prime(int n) {
        return n == 2 || Math.pow(2, n - 1) % n == 1;
    }
}
