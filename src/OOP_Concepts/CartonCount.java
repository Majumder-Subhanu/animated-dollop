package OOP_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class CartonCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int N_copy = N;
        int sum = 0;
        int[] label = {48, 24, 12, 6};
        int[] num_of_cartons = new int[4];
        Arrays.fill(num_of_cartons, 0);
        if (N >= 48) {
            num_of_cartons[0] = N / 48;
            N = N % 48;
        }
        if (N >= 24) {
            num_of_cartons[1] = N / 24;
            N = N % 24;
        }
        if (N >= 12) {
            num_of_cartons[2] = N / 12;
            N = N % 12;
        }
        if (N >= 6) {
            num_of_cartons[3] = N / 6;
            N = N % 6;
        }
        for (int i = 0; i < 4; i++) {
            if (num_of_cartons[i] != 0) {
                System.out.printf("%d X %d = %d\n", label[i], num_of_cartons[i], label[i] * num_of_cartons[i]);
            }
        }
        System.out.printf("Remaining boxes = %d\n", N);
        System.out.printf("Total number of boxes = %d\n", N_copy);
        for (int num_of_carton : num_of_cartons) {
            sum += num_of_carton;
        }
        System.out.printf("Number of cartons = %d", sum);

    }

}
