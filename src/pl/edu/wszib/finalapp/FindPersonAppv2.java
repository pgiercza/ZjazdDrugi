package pl.edu.wszib.finalapp;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;


public class FindPersonAppv2 {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final String DB_USER = "pgiercza";
    private static final String DB_PASS = "****";
    private static final String DB_NAME = "AdventureWorks";
    private static final int DB_PORT = 1433;


    private static final String SQL = "SELECT TOP 10 * FROM Person.Contact where LastName like ?";

    public static void main(String[] args) {
        FindPersonAppv2 fap = new FindPersonAppv2();

        try (Connection connection = fap.connection(DB_USER, DB_PASS, DB_NAME);
             PreparedStatement ps = connection.prepareStatement(SQL);
        ) {
            if (args.length == 0) {
                System.out.println("Nie podano nazwiska!");
            } else {
                ps.setString(1, args[0] + "%");
                ResultSet rs = ps.executeQuery();
                if (!rs.next()) {
                    System.out.println("Nie znaleziono żadnych osób!");
                } else {
                    System.out.print(rs.getString("FirstName") + " ");
                    System.out.print(rs.getString("LastName") + " ");
                    System.out.println(rs.getString("EmailAddress") + " ");
                }
            }


        } catch (SQLException e) {
            System.out.println("Coś poszło nie tak!" + e.getMessage());
        }
    }

    Connection connection(String userName, String password, String dbName) throws SQLServerException {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(DB_USER);
        ds.setPassword(DB_PASS);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        ds.setDatabaseName(DB_NAME);
        ds.setTrustServerCertificate(true);
        return ds.getConnection();

    }
}

