package File_Handling;

import java.io.*;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        String dir = "/home/subhanu/Desktop/To_Do_List.txt";
        File file = new File(dir);
        int task_no = 1;
        while (running) {
            System.out.print("1. Insert\n2. Delete task\n3. Show List\n4. Quit\nSelect operation :: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    try {
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);
                        System.out.print("Enter the task :: ");
                        String task = sc.nextLine();
                        pw.printf("Task %d : %s", task_no, task);
                        task_no++;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.print("Enter the task number to delete :: ");
                    int t_no = sc.nextInt();
                    try {
                        Scanner ob = new Scanner(file);
                        while (ob.hasNextLine()) {
                            if (ob.nextLine().contains("Task "+t_no+" : ")) {

                            }
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        Scanner ob = new Scanner(file);
                        while (ob.hasNextLine()) {
                            System.out.println(ob.nextLine());
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    running = false;
                    break;
                default:
                    System.out.println("Please select valid operation...");
            }
        }
    }
}
