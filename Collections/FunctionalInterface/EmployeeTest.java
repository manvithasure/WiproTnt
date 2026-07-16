import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<EmployeeInfo> list = new ArrayList<>();
        System.out.println("Enter details of 5 employees:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new EmployeeInfo(id, name, salary));
        }
        Predicate<EmployeeInfo> lowSalary = e -> e.getSalary() < 10000;

        System.out.println("\nEmployees whose salary is less than 10000:");

        list.stream()
            .filter(lowSalary)
            .forEach(e -> System.out.println(e.getName()));

        sc.close();
    }
}