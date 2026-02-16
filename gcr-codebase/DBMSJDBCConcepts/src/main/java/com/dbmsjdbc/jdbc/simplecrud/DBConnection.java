package com.dbmsjdbc.jdbc.simplecrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/practice_db";
    private static final String USER = "parents";
    private static final String PASSWORD = "parents@top";

    public static Connection getConnection() throws SQLException {

        Properties props = new Properties();
        props.setProperty("user", USER);
        props.setProperty("password", PASSWORD);
        props.setProperty("useSSL", "false");
        props.setProperty("serverTimezone", "UTC");
        props.setProperty("allowPublicKeyRetrieval", "true");

        return DriverManager.getConnection(URL, props);
    }
}