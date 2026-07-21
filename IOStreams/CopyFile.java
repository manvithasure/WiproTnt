import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String input = sc.nextLine();

        System.out.println("Enter the output file name");
        String output = sc.nextLine();

        FileReader fr = new FileReader(input);
        FileWriter fw = new FileWriter(output);

        int c;

        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();

        System.out.println("File is copied.");
    }
}