package General;

import java.util.Scanner;

public class GoldbatchSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 2, r = n - 2;
        for (int i = 0; i < (n / 2) - 1; i++) {
            if (is_prime(l) && is_prime(r)) System.out.printf("[%d, %d]\n", l, r);
            l++;
            r--;
        }
    }

    private static boolean is_prime(int n) {
        return n == 2 || Math.pow(2, n - 1) % n == 1;
    }
}
