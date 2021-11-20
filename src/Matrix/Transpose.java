package Matrix;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int m = sc.nextInt();
        int[][] ar = new int[m][m];
        int[][] ar2 = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                ar2[i][j] = ar[j][i];
            }
        }
        System.out.println("**********The Matrix**********");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%5d ", ar2[i][j]);
            }
            System.out.println();
        }
    }
}
