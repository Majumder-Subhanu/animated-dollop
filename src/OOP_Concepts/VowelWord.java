package OOP_Concepts;

import java.util.Scanner;

public class VowelWord {

    String str;
    int freq;

    VowelWord() {

        str = "";
        freq = 0;

    }

    void readstr() {

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

    }

    void freq_vowel() {

        String[] ar = str.split(" ");
        for (int i = 0; i < ar.length; i++) {
            char ch = Character.toLowerCase(ar[i].charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                freq++;
            }
        }

    }

    void display() {

        System.out.println("Frequency of words starting with a vowel : " + freq);

    }

    public static void main(String[] args) {

        VowelWord obj = new VowelWord();
        System.out.print("Enter a sentence : ");
        obj.readstr();
        obj.freq_vowel();
        obj.display();

    }

}
