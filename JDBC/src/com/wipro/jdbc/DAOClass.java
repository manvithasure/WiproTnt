package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOClass {

    String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
    String username = "hr";
    String password = "hr";

    // INSERT
    public void insert(int rollno, String name, String course,
                       String dob, double fee) {

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO STUDENT VALUES (?, ?, ?, TO_DATE(?, 'DD-Mon-YYYY'), ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setString(4, dob);
            ps.setDouble(5, fee);

            ps.executeUpdate();

            System.out.println("Student inserted successfully");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // DELETE
    public void delete(int rollno) {

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "DELETE FROM STUDENT WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student deleted successfully");
            } else {
                System.out.println("Student not found");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // MODIFY
    public void modify(int rollno, double fee) {

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "UPDATE STUDENT SET FEE = ? WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, fee);
            ps.setInt(2, rollno);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Fee modified successfully");
            } else {
                System.out.println("Student not found");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // DISPLAY
    public void display(int rollno) {

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM STUDENT WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Roll No: " + rs.getInt("ROLLNO"));
                System.out.println("Name: " + rs.getString("NAME"));
                System.out.println("Course: " + rs.getString("COURSE"));
                System.out.println("DOB: " + rs.getDate("DOB"));
                System.out.println("Fee: " + rs.getDouble("FEE"));

            } else {
                System.out.println("Student not found");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // DISPLAY ALL
    public void displayAll() {

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM STUDENT";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                    rs.getInt("ROLLNO") + "  " +
                    rs.getString("NAME") + "  " +
                    rs.getString("COURSE") + "  " +
                    rs.getDate("DOB") + "  " +
                    rs.getDouble("FEE")
                );
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}