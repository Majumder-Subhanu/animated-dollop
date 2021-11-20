package General;

import java.util.Scanner;

public class WordTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt();
        int mm = sc.nextInt();
        if (mm >= 1 && mm <= 15) {
            System.out.printf("%d minutes passed %d", mm, hh);
        } else if (mm >= 45 && mm <= 59) {
            System.out.printf("%d minutes to %d", 60 - mm, hh + 1);
        } else if (mm == 30) {
            System.out.printf("Half passed %d", hh);
        }
     }
}
