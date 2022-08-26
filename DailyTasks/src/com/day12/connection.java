package com.day12;

// Java Program to Retrieve Contents of a Table Using JDBC
// connection

// Showing linking of created database

// Importing SQL libraries to create database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

    Connection con = null;

    public static Connection connectDB() {

        try {
            // Importing and registering drivers
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mapping",
                    "root", "Hansuja12#");
            // here,root is the username and 1234 is the
            // password,you can set your own username and
            // password.
            return con;
        }
        catch (SQLException | ClassNotFoundException e) {

            System.out.println(e);
        }
        return connectDB();
    }
}

