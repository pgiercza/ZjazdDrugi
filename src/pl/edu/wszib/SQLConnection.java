package pl.edu.wszib;

import java.sql.*;

public class SQLConnection {
    public static void main(String[] args) {

        //pamiÄtaj o zarejestrowaniu sterownika!!!

        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;user=user_name;password=****";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM Person.Contact";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}