package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class DeleteStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established successfully");

            System.out.print("Enter Roll No to delete: ");
            int rollno = sc.nextInt();

            // Get student details before deleting
            String selectSQL = "SELECT STUDENTNAME, STANDARD FROM STUDENT_PS WHERE ROLLNO = ?";

            PreparedStatement selectPS = con.prepareStatement(selectSQL);
            selectPS.setInt(1, rollno);

            ResultSet rs = selectPS.executeQuery();

            if (rs.next()) {

                String name = rs.getString("STUDENTNAME");
                String standard = rs.getString("STANDARD");

                // Insert details into STUDENTLOG
                String logSQL =
                    "INSERT INTO STUDENTLOG VALUES (?, ?, ?, ?)";

                PreparedStatement logPS = con.prepareStatement(logSQL);

                logPS.setInt(1, rollno);
                logPS.setString(2, name);
                logPS.setString(3, standard);
                logPS.setDate(4, Date.valueOf(LocalDate.now()));

                logPS.executeUpdate();

                // Delete student
                String deleteSQL =
                    "DELETE FROM STUDENT_PS WHERE ROLLNO = ?";

                PreparedStatement deletePS = con.prepareStatement(deleteSQL);

                deletePS.setInt(1, rollno);

                int result = deletePS.executeUpdate();

                if (result > 0) {
                    System.out.println("Student deleted successfully");
                }

                logPS.close();
                deletePS.close();

            } else {
                System.out.println("Student not found");
            }

            rs.close();
            selectPS.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}