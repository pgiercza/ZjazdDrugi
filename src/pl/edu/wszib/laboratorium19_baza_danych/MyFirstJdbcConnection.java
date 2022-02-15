package pl.edu.wszib.laboratorium19_baza_danych;
import java.sql.*;

public class MyFirstJdbcConnection {
    public static void main(String[] args) {

        //pamiÄtaj o zarejestrowaniu sterownika!!!-File-> Project Structure->Library

        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;username=pgiercza;password=****;trustServerCertificate=true";

        try (Connection con = DriverManager.getConnection(connectionUrl);
             Statement stmt = con.createStatement();) {
            String sql = "SELECT TOP 10*FROM Person.Contact ORDER BY FirstName";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + "  " + rs.getString("LastName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}