package com.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/ecommerce_db";
    private static final String USER=  "root";  // Your MySQL username
    private static final String PASSWORD = "Lonewolf@#18"; // Your MySQL password

    public static Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected Successfully!");
        }catch (SQLException e) {
            System.out.println("database connection failed!");
            e.printStackTrace();
        }
        return connection;
    }

}
