package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ModifyStudent {

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

            System.out.print("Enter New Fee: ");
            double fee = sc.nextDouble();

            String sql = "UPDATE STUDENT_PS SET FEES = ? WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, fee);
            ps.setInt(2, rollno);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student fee updated successfully");
            } else {
                System.out.println("Student not found");
            }

            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println(e);
        }
    }
}