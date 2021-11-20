package OOP_Concepts;

import java.util.Scanner;

public class Happy {

    int n;
    int copy;

    Happy() {

        n = 0;
        copy = n;

    }

    void getnum(int nn) {

        n = nn;
        copy = nn;

    }

    int sum_sq_digits(int x) {

        if (x == 0) {
            return x;
        } else {
            int sum =0;
            sum += Math.pow(x % 10, 2);
            x /= 10;
            return sum_sq_digits(x);
        }

    }

    void ishappy() {

        n = sum_sq_digits(0);
        if (n == 1) {
            System.out.println("OOP_Concepts.Happy number");
        } else if (n <= 9) {
            System.out.println("Not a happy number");
        } else {
            n = sum_sq_digits(n);
        }

    }

    public static void main(String[] args) {

        Happy obj = new Happy();
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        obj.getnum(nn);
        while (obj.sum_sq_digits(nn) > 9) {

        }

    }

}
