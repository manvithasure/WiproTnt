package com.wipro.jdbc;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        int option = Integer.parseInt(args[0]);

        // INSERT
        if (option == 1) {

            int rollno = Integer.parseInt(args[1]);
            String name = args[2];
            String course = args[3];
            String dob = args[4];
            double fee = Double.parseDouble(args[5]);

            dao.insert(rollno, name, course, dob, fee);
        }

        // DELETE
        else if (option == 2) {

            int rollno = Integer.parseInt(args[1]);

            dao.delete(rollno);
        }

        // MODIFY
        else if (option == 3) {

            int rollno = Integer.parseInt(args[1]);
            double fee = Double.parseDouble(args[2]);

            dao.modify(rollno, fee);
        }

        // DISPLAY
        else if (option == 4) {

            if (args.length == 2) {

                int rollno = Integer.parseInt(args[1]);

                dao.display(rollno);

            } else {

                dao.displayAll();
            }
        }

        else {
            System.out.println("Invalid option");
        }
    }
}