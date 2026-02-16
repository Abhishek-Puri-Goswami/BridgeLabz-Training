package com.dbmsjdbc.jdbc.transactionmgmt;

import java.sql.*;

public class BankDAO {

    public void recreateTables() {
        String dropTxn = "DROP TABLE IF EXISTS transaction_history";
        String dropAcc = "DROP TABLE IF EXISTS account";

        String createAccount =
                "CREATE TABLE account (" +
                        "account_id INT PRIMARY KEY AUTO_INCREMENT," +
                        "holder_name VARCHAR(60) NOT NULL," +
                        "balance DECIMAL(12,2) NOT NULL" +
                        ")";

        String createTxn =
                "CREATE TABLE transaction_history (" +
                        "txn_id INT PRIMARY KEY AUTO_INCREMENT," +
                        "from_account INT," +
                        "to_account INT," +
                        "amount DECIMAL(12,2)," +
                        "txn_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP," +
                        "FOREIGN KEY (from_account) REFERENCES account(account_id)," +
                        "FOREIGN KEY (to_account) REFERENCES account(account_id)" +
                        ")";

        String insertSample =
                "INSERT INTO account (holder_name, balance) VALUES " +
                        "('Naruto Uzumaki', 100000)," +
                        "('Monkey D Luffy', 75000)," +
                        "('Goku Son', 120000)," +
                        "('Levi Ackerman', 90000)";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.execute(dropTxn);
            stmt.execute(dropAcc);

            stmt.execute(createAccount);
            stmt.execute(createTxn);

            stmt.executeUpdate(insertSample);
            System.out.println("Bank tables recreated with sample data");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // TRANSFER USING TRANSACTION
    public void transferMoney(int fromId, int toId, double amount) {
	
	if(fromId == toId) {
	    System.out.println("Transfer Failed: Both accounts are same.");
            return;
	}
	
        String withdrawSql =
                "UPDATE account SET balance = balance - ? " +
                        "WHERE account_id = ? AND balance >= ?";

        String depositSql =
                "UPDATE account SET balance = balance + ? " +
                        "WHERE account_id = ?";

        String historySql =
                "INSERT INTO transaction_history(from_account,to_account,amount) " +
                        "VALUES(?,?,?)";

        try (Connection conn = DBConnection.getConnection()) {

            conn.setAutoCommit(false);

            PreparedStatement withdrawPs = conn.prepareStatement(withdrawSql);

            withdrawPs.setDouble(1, amount);
            withdrawPs.setInt(2, fromId);
            withdrawPs.setDouble(3, amount);

            int rows = withdrawPs.executeUpdate();

            if (rows == 0) {
                conn.rollback();
                System.out.println("Transfer Failed: Insufficient Balance");
                return;
            }

            PreparedStatement depositPs = conn.prepareStatement(depositSql);

            depositPs.setDouble(1, amount);
            depositPs.setInt(2, toId);
            depositPs.executeUpdate();

            PreparedStatement historyPs = conn.prepareStatement(historySql);

            historyPs.setInt(1, fromId);
            historyPs.setInt(2, toId);
            historyPs.setDouble(3, amount);
            historyPs.executeUpdate();

            conn.commit();
            System.out.println("Transfer Successful");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // CHECK BALANCE
    public void checkBalance(String name) {

        String sql =
                "SELECT account_id, holder_name, balance " +
                        "FROM account WHERE holder_name=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            System.out.printf(
                    "%-5s %-20s %-12s%n",
                    "ID",
                    "Name",
                    "Balance");

            while (rs.next()) {

                System.out.printf(
                        "%-5d %-20s %-12.2f%n",
                        rs.getInt("account_id"),
                        rs.getString("holder_name"),
                        rs.getDouble("balance"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // TRANSACTION HISTORY
    public void viewHistory() {

        String sql = "SELECT * FROM transaction_history";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.printf(
                    "%-5s %-8s %-8s %-10s %-20s%n",
                    "ID",
                    "FROM",
                    "TO",
                    "AMOUNT",
                    "TIME");

            while (rs.next()) {
                System.out.printf(
                        "%-5d %-8d %-8d %-10.2f %-20s%n",
                        rs.getInt("txn_id"),
                        rs.getInt("from_account"),
                        rs.getInt("to_account"),
                        rs.getDouble("amount"),
                        rs.getTimestamp("txn_time"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void printAccountTable() {

	    String sql = "SELECT * FROM account";

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ResultSet rs = ps.executeQuery()) {

	        System.out.println("\n------ ACCOUNT TABLE ------");

	        System.out.printf(
	                "%-5s %-20s %-12s%n",
	                "ID",
	                "Name",
	                "Balance");

	        while (rs.next()) {

	            System.out.printf(
	                    "%-5d %-20s %-12.2f%n",
	                    rs.getInt("account_id"),
	                    rs.getString("holder_name"),
	                    rs.getDouble("balance"));
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
