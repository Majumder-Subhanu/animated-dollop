package Matrix;

import java.util.Scanner;

class SaddlePoint {
    static boolean findSaddlePoint(int[][] mat, int n, int m) {
        for (int i = 0; i < m; i++) {
            int min_row = mat[i][0], col_ind = 0;
            for (int j = 1; j < n; j++) {
                if (min_row > mat[i][j]) {
                    min_row = mat[i][j];
                    col_ind = j;
                }
            }
            int k;
            for (k = 0; k < n; k++)
                if (min_row < mat[k][col_ind])
                    break;
            if (k == n) {
                System.out.println("Saddle point = " + min_row);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ar = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        if (!findSaddlePoint(ar, m, n))
            System.out.println("No Saddle Point ");
    }
}
