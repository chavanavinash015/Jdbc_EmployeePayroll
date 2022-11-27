package com.bridgelabz;

import java.sql.*;

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
            PreparedStatement st = con.prepareStatement("Select * from salary_detail");
            PreparedStatement st2 = con.prepareStatement("Select * from salary_detail where start_date Between '2018-09-21' AND '2018-09-24'");
            boolean result = st2.execute();
            if (result) {
                ResultSet rs = st2.getResultSet();
                while (rs.next()) {
                    int id
                            = rs.getInt("salary_id"); // Retrieve name from db
                    System.out.println(id); // Print result on console
                    String name
                            = rs.getString("basic_pay"); // Retrieve name from db
                    System.out.println(name); // Print result on console
                    String gender
                            = rs.getString("deductions"); // Retrieve name from db
                    System.out.println(gender); // Print result on console
                    String city
                            = rs.getString("taxable_pay"); // Retrieve name from db
                    System.out.println(city); // Print result on console
                    String state
                            = rs.getString("tax"); // Retrieve name from db
                    System.out.println(state); // Print result on console
                    String PhoneNumber
                            = rs.getString("net_pay"); // Retrieve name from db
                    System.out.println(PhoneNumber); // Print result on console
                    String country
                            = rs.getString("start_date"); // Retrieve name from db
                    System.out.println(country); // Print result on console
                }
            }else{
                int rowcount=st2.getMaxRows();
                System.out.println(rowcount);
            }
//            }else{
//                int rowCount = st1.getUpdateCount();
//                System.out.println(rowCount);
//            }

            con.close(); // close connection
            System.out.println("Connection Closed....");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

