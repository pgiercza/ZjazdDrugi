package pl.edu.wszib.finalapp;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;


public class FindPersonApp {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final String DB_USER = "pgiercza";
    private static final String DB_PASS = "****";
    private static final String DB_NAME = "AdventureWorks";
    private static final int DB_PORT = 1433;


    private static final String SQL = "SELECT TOP 10 * FROM Person.Contact where LastName like 'Anderson'";

    public static void main(String[] args) {
        FindPersonApp fap = new FindPersonApp();

        try (Connection connection = fap.connection(DB_USER, DB_PASS, DB_NAME);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL);
        ) {
            while (resultSet.next()) {
                System.out.print(resultSet.getString("FirstName") + " ");
                System.out.print(resultSet.getString("LastName") + " ");
                System.out.println(resultSet.getString("EmailAddress") + " ");
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

