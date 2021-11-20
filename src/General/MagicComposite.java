package General;

import java.util.Scanner;

public class MagicComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (!is_prime(num) && is_magic(num)) {
            System.out.println("Magic composite number");
        } else {
            System.out.println("Not a OOP_Concepts.magic composite number");
        }
    }

    private static boolean is_magic(int num) {
        if (num == 1) return true;
        else if (num < 10) return false;
        else return is_magic(sum_of_digits(num));
    }

    private static int sum_of_digits(int num) {
        int sum = 0;
        while (num != 0) {
            int d =num % 10;
            sum += d;
            num /= 10;
        }
        return sum;
    }

    private static boolean is_prime(int n) {
        return n == 2 || Math.pow(2, n - 1) % n == 1;
    }
}
