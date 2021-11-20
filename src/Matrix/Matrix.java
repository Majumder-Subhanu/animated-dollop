package Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {

    int[][] arr;
    int m;
    int n;

    Matrix(int mm, int nn) {

        m = mm;
        n = nn;
        arr  = new int[m][n];

    }

    void fillarray() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

    }

    public static void main(String[] args) {



    }

}
