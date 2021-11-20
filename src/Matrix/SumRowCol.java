package Matrix;

import java.util.Scanner;

public class SumRowCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ar  = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        int sum_row = 0, sum_col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum_row += ar[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " = " + sum_row);
            sum_row = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum_col += ar[j][i];
            }
            System.out.println("Sum of col " + (i+1) + " = " + sum_col);
            sum_col = 0;
        }
    }
}
