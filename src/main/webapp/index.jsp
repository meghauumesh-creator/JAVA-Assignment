<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Employee Entry</title></head>
<body>
    <h2>Enter Employee Details</h2>
    <form action="InsertServlet" method="post">
        Emp No: <input type="number" name="empno" required><br><br>
        Name: <input type="text" name="empname" required><br><br>
        Salary: <input type="number" name="salary" required><br><br>
        <input type="submit" value="Add Employee and Show Report">
    </form>
</body>
</html>