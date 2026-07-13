public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Rahul", "rahul@gmail.com", "Male", 35000);
        Employee e2 = new Employee(102, "Priya", "priya@gmail.com", "Female", 42000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        System.out.println("Employee Details");
        db.displayEmployees();

        System.out.println(db.showPaySlip(101));

        System.out.println("\nDeleting Employee 102");
        db.deleteEmployee(102);

        System.out.println("\nRemaining Employees");
        db.displayEmployees();
    }
}