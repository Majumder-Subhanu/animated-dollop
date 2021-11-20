package General;

import java.util.Scanner;

public class EmbeddedPrime {

    public static boolean is_prime(int num) {

        return num == 2 || Math.pow(2, num - 1) % num == 1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = ""+n;
        for (int i = 0; i < num.length(); i++) {
            for (int j = i; j < num.length(); j++) {
                String s = num.substring(i, j+1);
                int sub_num = Integer.parseInt(s);
                if (is_prime(sub_num)) System.out.println(sub_num);
            }
        }

    }

}
