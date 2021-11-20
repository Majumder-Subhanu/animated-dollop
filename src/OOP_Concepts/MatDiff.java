package OOP_Concepts;

import java.util.Scanner;

public class MatDiff {
    int m, n;
    int[][] ar;

    MatDiff(int mm, int nn) {
        m = mm;
        n = nn;
        ar = new int[m][n];
    }

    void take_input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
    }

    MatDiff matrix_subtract(MatDiff A, MatDiff B) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = A.ar[i][j] - B.ar[i][j];
            }
        }
        return this;
    }

    void display() {
        System.out.println("**********The Matrix**********");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%5d ", ar[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        MatDiff ob = new MatDiff(m, n);
        MatDiff ob2 = new MatDiff(m, n);
        MatDiff ob3 = new MatDiff(m, n);
        System.out.println("Enter elements of matrix 1");
        ob2.take_input();
        System.out.println("Enter elements of matrix 2");
        ob3.take_input();
        System.out.println("Matrix 1 - Matrix 2");
        ob = ob.matrix_subtract(ob2, ob3);
        ob.display();
    }
}
