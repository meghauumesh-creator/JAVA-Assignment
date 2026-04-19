/*
 Read all the existing records from the table coffee which is from the database test and delete an
existing coffee product from the table with its id.
 */

package com.sql;
import java.sql.*;

public class CoffeeDeleteDemo {
    public static void main(String[] args) {

        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "meri1234");

            Statement st = con.createStatement();

            // ✅ Step 1: Display existing records
            System.out.println("--- Existing Records ---");
            ResultSet rs = st.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("coffee_name") + " | " +
                    rs.getInt("price")
                );
            }

            // ✅ Step 2: Delete record using id
            int deleteId = 101;   // change this to existing id

            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM coffee WHERE id = ?"
            );
            ps.setInt(1, deleteId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("\nRecord with ID " + deleteId + " deleted successfully!");
            } else {
                System.out.println("\nNo record found with given ID.");
            }

            // ✅ Step 3: Display updated records
            System.out.println("\n--- Updated Records ---");
            rs = st.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("coffee_name") + " | " +
                    rs.getInt("price")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}