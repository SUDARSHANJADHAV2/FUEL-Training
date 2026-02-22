package JDBC;
import java.sql.*;
import java.util.*;

public class InsertDataUsingPreparedStatements{

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
            String query = "INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            PreparedStatement perparedStatement = connection.prepareStatement(query);
            perparedStatement.setString(1, "Sakshi");
            perparedStatement.setInt(2,23);
            perparedStatement.setDouble(3,99.7);
            
            int rowsAffected = perparedStatement.executeUpdate();
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
