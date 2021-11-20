package Matrix;

import java.util.Scanner;

public class RowColFill {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ar = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[j][i] = sc.nextInt();
            }
        }
        System.out.println("*******************The Matrix*******************");
        for (int[] i : ar) {
            for (int j : i) {
                System.out.printf("%5s", j);
            }
            System.out.println();
        }
    }
}
