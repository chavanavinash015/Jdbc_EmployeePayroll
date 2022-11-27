package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEmpPayroll {

    public static void main(String[] args) {
        System.out.println("Welcome to employee payroll ");

        String url = "jdbc:mysql://localhost:3306/employee_payrolldata"; // table details
        String username = "root"; // MySQL credentials
        String password = "Avinash@015";

        try {
            Class.forName(
                    "com.mysql.cj.jdbc.Driver"); // Driver name
            Connection con = DriverManager.getConnection(
                    url, username, password);
            System.out.println(
                    "Connection Established successfully");
            con.close(); // close connection
            System.out.println("Connection Closed....");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

