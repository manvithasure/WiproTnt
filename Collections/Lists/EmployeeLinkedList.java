import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeLinkedList {

    LinkedList<EmployeeInfo> employees = new LinkedList<>();

    public boolean insertEmployee(EmployeeInfo emp) {
        return employees.add(emp);
    }

    public boolean removeEmployee(int empId) {

        Iterator<EmployeeInfo> itr = employees.iterator();

        while (itr.hasNext()) {
            EmployeeInfo emp = itr.next();

            if (emp.empId == empId) {
                itr.remove();
                return true;
            }
        }

        return false;
    }

    public String displaySalarySlip(int empId) {

        for (EmployeeInfo emp : employees) {

            if (emp.empId == empId) {

                return "******** PAY SLIP ********\n"
                        + "Employee ID   : " + emp.empId
                        + "\nEmployee Name : " + emp.empName
                        + "\nSalary        : " + emp.salary;
            }
        }

        return "Employee Not Found";
    }

    public void displayEmployees() {

        for (EmployeeInfo emp : employees) {
            emp.displayEmployee();
            System.out.println("---------------------------");
        }
    }
}