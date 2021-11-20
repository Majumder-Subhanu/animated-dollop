package General;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m + 1; true; i++) {
            if (sum_of_digits(i) == n) {
                System.out.println(i);
                break;
            }
        }
    }

    private static int sum_of_digits(int i) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
