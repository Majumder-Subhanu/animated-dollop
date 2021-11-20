package OOP_Concepts;

import java.util.Scanner;

public class Combine {

    int[] com;
    int size;

    Combine(int nn) {

        size = nn;
        com = new int[size];

    }

    void inputarray() {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < com.length; i++) {
            com[i] = sc.nextInt();
        }
    }

    void sort() {

        for (int i = 0; i < com.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < com.length; j++) {
                if (com[j] < com[index]) {
                    index = j;
                }
            }
            int smallerNumber = com[index];
            com[index] = com[i];
            com[i] = smallerNumber;
        }

    }

    void mix(Combine A, Combine B) {

        com = new int[size];
        int k = 0;
        for (int i = 0; i < com.length; i++) {
            if (i < A.com.length) {
                com[i] = A.com[i];
            } else {
                com[i] = B.com[k];
                k++;
            }
        }

    }

    void display() {

        for (int i = 0; i < com.length; i++) {
            System.out.printf(com[i] + "  ");
        }

    }

    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array 1 : ");
        size = sc.nextInt();
        Combine A = new Combine(size);
        System.out.print("Enter elements of array 1 : ");
        A.inputarray();
        System.out.print("Enter size of array 2 : ");
        size = sc.nextInt();
        Combine B = new Combine(size);
        System.out.print("Enter elements of array 2 : ");
        B.inputarray();

        Combine C = new Combine(size = A.com.length + B.com.length);

        C.mix(A, B);
        C.sort();
        System.out.print("The final combined and sorted array is : ");
        C.display();

    }

}
