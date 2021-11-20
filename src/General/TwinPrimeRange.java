package General;

import java.util.Scanner;

public class TwinPrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        for (int i = min; i <= max - 2; i++) {
            if (is_prime(i) && is_prime(i + 2)) System.out.printf("[%d, %d]\n", i, i + 2);
        }
    }

    private static boolean is_prime(int n) {
        return n == 2 || Math.pow(2, n - 1) % n == 1;
    }
}
