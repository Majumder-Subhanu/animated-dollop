package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class DiaSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] ar = new int[m][m];
        int sum_p = 0, sum_s = 0;
        int[] primary = new int[m];
        int[] secondary = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
            }
            sum_p += ar[i][i];
            sum_s += ar[i][m - 1 - i];
        }
        System.out.printf("Primary diagonal sum = %d\n", sum_p);
        System.out.printf("Secondary diagonal sum = %d\n", sum_s);
    }
}
