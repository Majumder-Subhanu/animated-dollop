package Matrix;

import java.util.Scanner;

public class Assignment {

    int[][] dda;

    Assignment(int row, int col) {

        dda = new int[row][col];
        take_input();
        for (int i = 0; i < row; i++) {
            System.out.printf("Highest element in row %d is %d\n", (i + 1), highest_ele_row()[i]);
        }
        for (int i = 0; i < col; i++) {
            System.out.printf("Lowest element in column %d is %d\n", (i + 1), lowest_ele_col()[i]);
        }
        sum_diagonal();

    }

    void take_input() {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < dda.length; i++) {
            for (int j = 0; j < dda[i].length; j++) {
                dda[i][j] = sc.nextInt();
            }
        }

    }

    int[] highest_ele_row() {

        int[] ele = new int[dda.length];
        for (int i = 0; i < dda.length; i++) {
            int max = dda[i][0];
            for (int j = 0; j < dda[i].length; j++) {
                if (dda[i][j] > max) max = dda[i][j];
            }
            ele[i] = max;
            max = 0;
        }
        return ele;

    }

    int[] lowest_ele_col() {

        int[] ele = new int[dda.length];
        for (int i = 0; i < dda.length; i++) {
            int min = dda[i][0];
            for (int j = 0; j < dda[i].length; j++) {
                if (dda[j][i] < min && j < i) min = dda[i][j];
            }
            ele[i] = min;
            min = 0;
        }
        return ele;

    }

    void sum_diagonal() {

        int sum = 0;
        if (dda.length == dda[0].length) {
            for (int i = 0; i < dda.length; i++) {
                sum += dda[i][i];
            }
            System.out.println("Sum of diagonal of the matrix = " + sum);
        } else {
            System.out.println("Not a square matrix");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        if ((row >= 2 && row <= 7) && (col >= 3 && col <= 5)) {
            Assignment obj = new Assignment(row, col);
        } else {
            row = sc.nextInt();
            col = sc.nextInt();
            while (!(row >= 2 && row <= 7) && !(col >= 3 && col <= 5)) {
                row = sc.nextInt();
                col = sc.nextInt();
            }
            Assignment obj = new Assignment(row, col);
        }

    }

}
