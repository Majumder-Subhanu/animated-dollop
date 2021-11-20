package OOP_Concepts;

import java.util.Scanner;

public class Exchange {

    String sent;
    String rev;
    int size;

    Exchange() {

        sent = "";
        rev = "";
        size = 0;

    }

    void readsentence() {

        Scanner sc = new Scanner(System.in);
        sent = sc.nextLine();

    }

    void exfirstlast() {

        String[] ar = sent.split(" ");
        for (int i = 0; i < ar.length; i++) {
            char temp = ar[i].charAt(0);
            char[] ch = ar[i].toCharArray();
            ch[0] = ch[ch.length-1];
            ch[ch.length-1] = temp;
            ar[i] = ch.toString();
        }
        for (int i = 0; i < ar.length; i++) {
            rev += ar[i];
        }

    }

    void display() {

        System.out.println("Original sentence : " + sent);
        System.out.println("New sentence : " + rev);

    }

    public static void main(String[] args) {

        Exchange obj = new Exchange();
        obj.readsentence();
        obj.exfirstlast();
        obj.display();

    }

}
