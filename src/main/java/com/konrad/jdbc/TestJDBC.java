package com.konrad.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/employees?useSSL=false";
        String user = "root";
        String password = "aaaaaa";
        try {
            System.out.println("Connecting to database: " + jdbcUrl);
            Connection myConection = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection succeed ");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
