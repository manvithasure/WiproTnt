import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
public class EmployeeLocationFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Enter details of 5 employees:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Location: ");
            String location = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, location, salary));
        }
        Function<Employee, String> getLocation = emp -> emp.getLocation();
        ArrayList<String> locations = new ArrayList<>();
        for (Employee emp : employees) {
            locations.add(getLocation.apply(emp));
        }
        System.out.println("\nEmployee Locations:");
        for (String loc : locations) {
            System.out.println(loc);
        }
        sc.close();
    }
}