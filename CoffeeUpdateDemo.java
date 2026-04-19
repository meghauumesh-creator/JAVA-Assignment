/*
 Read all the existing records from the table coffee which is from the database test and update
an existing coffee product in the table with its id.
 */

package com.sql;
import java.sql.*;
import java.util.Properties;

public class CoffeeUpdateDemo {
    public static void main(String[] args) {

        Connection dbConnection = null;

        try {
            // Step 1: Connect to database
            String url = "jdbc:mysql://localhost:3306/test";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "meri1234");

            dbConnection = DriverManager.getConnection(url, info);

            if (dbConnection != null) {
                System.out.println("Connected to MySQL database 'test'");
            }

            // Step 2: Read all records
            System.out.println("\n--- Existing Records ---");
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("coffee_name");
                int price = rs.getInt("price");

                System.out.println(id + " | " + name + " | " + price);
            }

            // Step 3: Update record using id
            System.out.println("\n--- Updating Record ---");

            PreparedStatement pstmt = dbConnection.prepareStatement(
                "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?"
            );

            pstmt.setString(1, "Royal"); // new coffee name
            pstmt.setInt(2, 500);          // new price
            pstmt.setInt(3, 102);            // id to update

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Record updated successfully!");
            } else {
                System.out.println("No record found with given ID.");
            }

            // Step 4: Display updated records
            System.out.println("\n--- Updated Records ---");
            rs = st.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("coffee_name");
                int price = rs.getInt("price");

                System.out.println(id + " | " + name + " | " + price);
            }

            // Close resources
            rs.close();
            st.close();
            pstmt.close();
            dbConnection.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}