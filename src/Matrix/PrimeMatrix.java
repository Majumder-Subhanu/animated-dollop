package Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeMatrix {
    private static boolean is_prime(int n) {
        return n == 2 || Math.pow(2, n - 1) % n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ar  = new int[m][n];
        int[] primes = new int[m*n];
        int k = 0;
        for (int i = 0; i < m*n  ; i++) {
            for (int j = 2; ; j++) {
                if (is_prime(j)) {
                    primes[k] = j;
                    k++;
                    break;
                }
            }
        }
        k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = primes[k];
                k++;
            }
        }

        System.out.println("**********The Matrix**********");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d ", ar[i][j]);
            }
            System.out.println();
        }
    }
}
