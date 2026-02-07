package JDBC;
import java.sql.*;
import java.util.*;

public class Insert{

    private static final String url ="jdbc:mysql://localhost:3306/myDB";
    private static final String username="root" ;
    private static final String password="Admin@123";
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
        //    e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username,password);
            Statement statement = connection.createStatement();
            String query =String.format("INSERT INTO students(name,age,marks) VALUES('%s',%o,%f)" , "Rahul",23,74.5);
            int rowsAffected = statement.executeUpdate(query);
            if (rowsAffected>0) {
            	System.out.println("Data Inserted Successfully!!!!");
            }
            else {
            	System.out.println("No Data Inserted!!!");
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
