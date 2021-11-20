package General;

import java.util.Scanner;

public class LuckyNumber {
    public static int count = 2;

    static boolean isLuckyNumber(int n) {
        if (count > n)
            return true;
        if (n % count == 0)
            return false;
        n = n - (n / count);
        count++;
        return isLuckyNumber(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (isLuckyNumber(num)) {
            System.out.println(num + " is a Lucky Number.");
        } else {
            System.out.println(num + " is not a Lucky Number.");
        }
    }
}

class LuckyNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int elements = n;
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int del = 1;
        while (del < n) {
            for (int i = del; i < n; i += del) {
                // if (n - 1 - i >= 0) System.arraycopy(arr, i + 1, arr, i, n - 1 - i);
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                n--;
            }
            del++;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        System.out.print("\nHence, the Lucky Numbers Less than " + elements + " are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
