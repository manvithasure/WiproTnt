package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCCalls2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established successfully");

            System.out.print("Enter Roll No: ");
            int rollno = sc.nextInt();

            System.out.print("Enter Student Name: ");
            String name = sc.next();

            System.out.print("Enter Standard: ");
            String standard = sc.next();

            System.out.print("Enter Date of Birth (DD-MM-YYYY): ");
            String dob = sc.next();

            System.out.print("Enter Fees: ");
            double fees = sc.nextDouble();

            String sql = "INSERT INTO STUDENT_PS VALUES (?, ?, ?, TO_DATE(?, 'DD-MM-YYYY'), ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, standard);
            ps.setString(4, dob);
            ps.setDouble(5, fees);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student inserted successfully");
            }

            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}