package com.javamaster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/online_store";
        String user = "root";
        String password = "Graduate2018!";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successful to the database" + url);
            String query = "Insert into product_table(id,name) values(101,'ram')";
            Statement statement = connection.createStatement();
            statement.execute(query);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
