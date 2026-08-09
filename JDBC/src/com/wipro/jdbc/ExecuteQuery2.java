package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteQuery2 {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            String query = "SELECT ename, job, sal, comm FROM EMP_JDBC "
                         + "WHERE sal > 1000 AND sal < 2000";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                String ename = rs.getString("ename");
                String job = rs.getString("job");
                double sal = rs.getDouble("sal");
                double comm = rs.getDouble("comm");

                System.out.println(ename + "  " + job + "  " + sal + "  " + comm);
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