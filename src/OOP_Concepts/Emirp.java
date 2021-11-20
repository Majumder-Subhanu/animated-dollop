package OOP_Concepts;

import java.util.Scanner;

public class Emirp {

    int n;
    int rev;
    int f;

    Emirp(int nn) {

        n = nn;

    }

    int isprime(int x) {

        if (x <= 3) {
            return 1;
        } else {
            return isprime(x/2);
        }

    }

    void isEmirp() {

        int copy = n;
        while (n != 0) {
            rev = (rev*10) + (n%10);
            n /= 10;
        }
        if (isprime(copy) == 1 && isprime(rev) == 1) {
            System.out.println("OOP_Concepts.Emirp");
        } else {
            System.out.println("Not OOP_Concepts.Emirp");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        Emirp obj = new Emirp(nn);
        obj.isEmirp();

    }

}
