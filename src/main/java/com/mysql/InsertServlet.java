/*
 Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary into
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
and generate a salary report as follows by executing query Emp name starting with R
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
 */


package com.mysql;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.sql.*;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Form Data
        int empno = Integer.parseInt(request.getParameter("empno"));
        String empname = request.getParameter("empname");
        int salary = Integer.parseInt(request.getParameter("salary"));

        // Connection details
        String url = "jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "meri1234"; // Change to your password

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            // 2. Insert Record
            PreparedStatement ps = con.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
            ps.setInt(1, empno);
            ps.setString(2, empname);
            ps.setInt(3, salary);
            ps.executeUpdate();

            // 3. Generate Report (Names starting with R)
            out.println("<pre>");
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            out.println("Salary Report");
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Emp WHERE Emp_Name LIKE 'R%'");

            while (rs.next()) {
                out.println("Emp_No   : " + rs.getInt("Emp_NO"));
                out.println("Emp_Name : " + rs.getString("Emp_Name"));
                out.println("Basic    : " + rs.getInt("Basicsalary"));
                out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            out.println("</pre>");

            con.close();
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
}