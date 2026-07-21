public class Staff {

    int staffId;
    String staffName;
    String department;
    String email;
    double salary;

    public Staff(int staffId, String staffName, String department, String email, double salary) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println("Staff ID       : " + staffId);
        System.out.println("Staff Name     : " + staffName);
        System.out.println("Department     : " + department);
        System.out.println("Email          : " + email);
        System.out.println("Salary         : " + salary);
    }
}