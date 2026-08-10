package com.wipro.jdbc;

import java.sql.*;

public class CallableSalary {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established Successfully");
            System.out.println("----------------------------------------");

            String sql = "{call calculate_net_salary(?, ?)}";

            CallableStatement cs = con.prepareCall(sql);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT empno, ename FROM emp_jdbc"
            );

            while (rs.next()) {

                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");

                cs.setInt(1, empno);
                cs.registerOutParameter(2, Types.NUMERIC);

                cs.execute();

                double netSalary = cs.getDouble(2);

                System.out.println(
                    "EMPNO: " + empno +
                    " | ENAME: " + ename +
                    " | Net Salary: " + netSalary
                );
            }

            rs.close();
            st.close();
            cs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}