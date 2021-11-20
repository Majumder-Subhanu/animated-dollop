package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sod = sum_of_digits(n, 0);
        System.out.printf("Sum of digits of %d is %d", n, sod);
    }

    private static int sum_of_digits(int n, int sum) {
        if (n % 10 == 0) return n;
        else {
            sum += n % 10;
            return sum_of_digits(n / 10, sum);
        }
    }
}
