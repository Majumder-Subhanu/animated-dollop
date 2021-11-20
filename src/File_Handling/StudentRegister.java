package File_Handling;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentRegister
{
    public static void main(String[] args)
    {
        String dir = "/home/subhanu/Desktop/student.txt";
        File file = new File(dir);
        try 
        {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(bw);
            System.out.print("Enter number of names :: ");
            int n = Integer.parseInt(in.readLine());
            pw.println("Roll\tName\tMarks Obtained");
            for (int i = 1; i <= n; i++)
            {
                System.out.printf ("Enter roll number of student %d :: ", i);
                int roll = Integer.parseInt(in.readLine());
                System.out.printf ("Enter name of student %d :: ", i);
                String name = in.readLine();
                System.out.printf ("Enter marks of student %d :: ", i);
                float marks = Float.parseFloat(in.readLine());
                pw.println(roll + "\t\t" + name + "\t" + marks);
            }
            pw.flush();
            pw.close();
            bw.close();
            in.close();
        }
        catch (Exception e)
        {
            System.err.println();
        }
    }
}
