import java.util.ArrayList;
import java.util.Scanner;
public class StudentDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("Enter details of 5 Students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Mark: ");
            int mark = sc.nextInt();
            list.add(new Student(rollNo, name, mark));
        }
        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();
        System.out.println("\nNumber of students who passed: " + count);
        sc.close();
    }
}