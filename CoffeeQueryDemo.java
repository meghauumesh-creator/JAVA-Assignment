package com.sql;
import java.sql.*;

public class CoffeeQueryDemo {
    public static void main(String[] args) {

        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "meri1234");

            Statement st = con.createStatement();

            // ✅ Step 1: Display all records
            System.out.println("--- All Coffee Records ---");
            ResultSet rs = st.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("coffee_name") + " | " +
                    rs.getInt("price")
                );
            }

            // ✅ Step 2: Query coffee names starting with 'D'
            System.out.println("\n--- Coffee Names Starting with 'D' ---");

            String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
            rs = st.executeQuery(query);

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