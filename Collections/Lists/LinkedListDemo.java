public class LinkedListDemo {

    public static void main(String[] args) {

        EmployeeLinkedList company = new EmployeeLinkedList();

        company.insertEmployee(new EmployeeInfo(
                201,
                "Arjun",
                "arjun@gmail.com",
                "Male",
                48000));

        company.insertEmployee(new EmployeeInfo(
                202,
                "Kavya",
                "kavya@gmail.com",
                "Female",
                52000));

        company.insertEmployee(new EmployeeInfo(
                203,
                "Nikhil",
                "nikhil@gmail.com",
                "Male",
                61000));

        System.out.println("===== Employee Details =====");

        company.displayEmployees();

        System.out.println(company.displaySalarySlip(202));

        System.out.println("\nDeleting Employee ID 201");

        if (company.removeEmployee(201))
            System.out.println("Employee Deleted Successfully");
        else
            System.out.println("Employee Not Found");

        System.out.println("\n===== Remaining Employees =====");

        company.displayEmployees();
    }
}