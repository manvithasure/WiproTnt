import java.io.*;
import java.util.Scanner;
public class EmployeeManagementSystem{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        FileWriter fw;
        BufferedWriter bw;
        FileReader fr;
        BufferedReader br;
        while(true){
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    fw = new FileWriter("employee.txt", true);
                    bw = new BufferedWriter(fw);
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    bw.write(id + " " + name + " " + age + " " + salary);
                    bw.newLine();
                    bw.close();
                    fw.close();
                    break;
                case 2:
                    fr = new FileReader("employee.txt");
                    br = new BufferedReader(fr);
                    System.out.println("-----Report-----");
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    System.out.println("-----End of Report-----");
                    br.close();
                    fr.close();
                    break;
                case 3:
                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}