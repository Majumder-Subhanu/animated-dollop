package Matrix;

import java.util.Scanner;

public class NaturalNumberMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ar  = new int[m][n];
        int ele = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[j][i] = ele;
                ele++;
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
