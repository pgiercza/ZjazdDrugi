package pl.edu.wszib.finalapp;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.math.BigDecimal;
import java.sql.*;
import java.text.NumberFormat;

public class HomeBudget {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final String DB_USER = "pgiercza";
    private static final String DB_PASS = "****";
    private static final String DB_NAME = "pgiercza";
    private static final int DB_PORT = 1433;

    private static final String INSERT_ENTRY_SQL = "INSERT INTO budget.BudgetEntires(EntryName,Amount) VALUES (?,?);";
    private static final String GET_SUM_SQL = "SELECT SUM(Amount) AS Sum FROM budget.BudgetEntires;";

    public static void main(String[] args) {
        BudgetEntry budgetEntry = new BudgetEntry();
        budgetEntry.setEntryName(args[0]);
        budgetEntry.setAmound(new BigDecimal(args[1]));

        HomeBudget homeBudget = new HomeBudget();

        try (Connection connection = homeBudget.connection(DB_USER, DB_PASS, DB_NAME);
             Statement statement = connection.createStatement()) {

            PreparedStatement ps = connection.prepareStatement(INSERT_ENTRY_SQL);
            ps.setString(1, budgetEntry.getEntryName());
            ps.setBigDecimal(2, budgetEntry.getAmound());
            ps.execute();

            BigDecimal balance;
            ResultSet resultSet = statement.executeQuery(GET_SUM_SQL);
            if (resultSet.next()) {
                balance = resultSet.getBigDecimal("sum");
            } else {
                balance = BigDecimal.ZERO;
            }
            System.out.print("Zapisano! Kwota " + currencyFormat(budgetEntry.getAmound()));
            System.out.println(", nazwa  " + budgetEntry.getEntryName());
            System.out.println("Saldo: " + currencyFormat(balance));
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
    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }
}


/*USE pgiercza;

CREATE SCHEMA budget;

CREATE TABLE budget.BudgetEntires(
ID INT IDENTITY PRIMARY KEY,
EntryDate DATETIME NOT NULL DEFAULT GETDATE(),
EntryName NVARCHAR(255) NOT NULL,
Amount MONEY NOT NULL
);

SELECT*FROM budget.BudgetEntires;

INSERT INTO budget.BudgetEntires(EntryName,Amount) VALUES ('Kawa',19);

SELECT SUM(Amount) AS SUM FROM budget.BudgetEntires;*/