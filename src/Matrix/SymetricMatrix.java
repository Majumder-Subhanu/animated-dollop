package Matrix;

import java.util.Scanner;

public class SymetricMatrix {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int m = sc.nextInt();
        int[][] ar = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        boolean flag = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (ar[i][j] != ar[j][i]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) System.out.println("Symetric matrix");
        else System.out.println("Not a symetric matrix");
    }
}
