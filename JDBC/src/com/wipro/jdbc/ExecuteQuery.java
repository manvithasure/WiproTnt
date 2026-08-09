package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteQuery {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            String query = "SELECT empno, ename FROM EMP_JDBC";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                // EMPNO using column index
                int empno = rs.getInt(1);

                // ENAME using column name
                String ename = rs.getString("ename");

                System.out.println(empno + "  " + ename);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            System.out.println("Error occurred");
            System.out.println(e);
        }
    }
}