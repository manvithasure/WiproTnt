import java.util.Optional;
import java.util.Scanner;
class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String message) {
        super(message);
    }
}
public class OptionalDemo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to create an employee? (yes/no): ");
        String choice = sc.nextLine();
        Employee emp = null;
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            emp = new Employee(id, name);
        }
        try {
            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Employee is null"));
            System.out.println("\nEmployee Details");
            System.out.println("ID   : " + e.id);
            System.out.println("Name : " + e.name);
        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
        sc.close();
    }
}