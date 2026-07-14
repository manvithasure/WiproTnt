public class VectorDemo {

    public static void main(String[] args) {

        StaffVector office = new StaffVector();

        office.addStaff(new Staff(
                301,
                "Meena",
                "HR",
                "meena@gmail.com",
                45000));

        office.addStaff(new Staff(
                302,
                "Suresh",
                "Finance",
                "suresh@gmail.com",
                58000));

        office.addStaff(new Staff(
                303,
                "Divya",
                "Marketing",
                "divya@gmail.com",
                50000));

        System.out.println("===== STAFF DETAILS =====");

        office.viewStaff();

        office.printSalarySlip(302);

        System.out.println("\nDeleting Staff ID : 301");

        if (office.deleteStaff(301))
            System.out.println("Staff Removed Successfully");
        else
            System.out.println("Staff Not Found");

        System.out.println("\n===== UPDATED STAFF LIST =====");

        office.viewStaff();
    }
}