/*
 * Develop a JDBC project using JDBC to append the fields empno, empname and basicsalary into
the table Emp of the database Employee by getting the fields through JSP and Generate the report as
follows
CREATE TABLE Emp (
Emp_NO INTEGER PRIMARY KEY,
Emp_Name TEXT NOT NULL,
Basicsalary INTEGER
);
-- insert
INSERT INTO EMPLOYEE VALUES (101, &#39;Ramesh&#39;, 25000);
INSERT INTO EMPLOYEE VALUES (102, &#39;Ravi&#39;, 20000);
…..
Add 5 records into Emp table of Employee database through Java with JDBC
and generate a salary report as follows
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh&#39;
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
….
…
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
Grand Salary : 45000

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
*/

package com.sql;
import java.sql.*;

public class EmpSalaryReport {
    public static void main(String[] args) {

        int total = 0;

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Employee", "root", "meri1234");

            // Fetch records
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Emp");

            // Report Header
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Salary Report");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            // Loop through records
            while (rs.next()) {
                int id = rs.getInt("Emp_NO");
                String name = rs.getString("Emp_Name");
                int salary = rs.getInt("Basicsalary");

                total += salary;

                System.out.println("Emp_No : " + id);
                System.out.println("Emp_Name: " + name);
                System.out.println("Basic : " + salary);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            // Grand Total
            System.out.println("Grand Salary : " + total);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}