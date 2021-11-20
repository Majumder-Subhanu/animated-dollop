package OOP_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class SwapLetters {
    String s;
    String s2;

    SwapLetters() {
        s = "";
        s2 = "";
    }

    void take_input() {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
    }

    void interchange() {
        String[] ar = s.split(" ");
        for (int i = 0; i < ar.length; i++) {
            char[] chs = ar[i].toCharArray();
            char temp = chs[0];
            chs[0] = chs[chs.length - 1];
            chs[chs.length - 1] = temp;
            String k = "";
            for (char ch : chs) {
                k = k.concat("" + ch);
            }
            ar[i] = k;
        }
        for (String value : ar) {
            s2 = s2.concat(value + " ");
        }
    }

    void display() {
        System.out.println("Original string = " + s);
        System.out.println("New string = " + s2);
    }

    public static void main(String[] args) {
        SwapLetters ob = new SwapLetters();
        ob.take_input();
        ob.interchange();
        ob.display();
    }
}
