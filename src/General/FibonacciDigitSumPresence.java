package General;

import java.util.Scanner;

public class FibonacciDigitSumPresence {

    public static boolean is_fibonacci(int num) {
        int[] fibonacci = {0, 1, 2, 3, 5, 8};
        boolean flag = false;
        for (int j : fibonacci) {
            if (num == j) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum_fibonacci = 0, sum_non_fibonacci = 0;
        while (num != 0) {
            int d = num%10;
            if (is_fibonacci(d)) {
                sum_fibonacci += d;
            } else {
                sum_non_fibonacci += d;
            }
            num /= 10;
        }
        System.out.printf("Sum of fibonacci terms in the number is %d\n", sum_fibonacci);
        System.out.printf("Sum of non fibonacci terms in the number is %d\n", sum_non_fibonacci);
    }
}
