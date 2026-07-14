import java.util.Iterator;
import java.util.Vector;

public class StaffVector {

    Vector<Staff> staffList = new Vector<>();

    public void addStaff(Staff s) {
        staffList.add(s);
    }

    public boolean deleteStaff(int staffId) {

        Iterator<Staff> itr = staffList.iterator();

        while (itr.hasNext()) {

            Staff s = itr.next();

            if (s.staffId == staffId) {
                itr.remove();
                return true;
            }
        }

        return false;
    }

    public void printSalarySlip(int staffId) {

        for (Staff s : staffList) {

            if (s.staffId == staffId) {

                System.out.println("\n******** Salary Slip ********");
                System.out.println("Staff ID   : " + s.staffId);
                System.out.println("Name       : " + s.staffName);
                System.out.println("Department : " + s.department);
                System.out.println("Salary     : " + s.salary);
                return;
            }
        }

        System.out.println("Staff not found.");
    }

    public void viewStaff() {

        for (Staff s : staffList) {
            s.showDetails();
            System.out.println("-----------------------------");
        }
    }
}