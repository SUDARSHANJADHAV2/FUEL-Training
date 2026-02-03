package JDBC;
import java.sql.*;
import java.util.*;

public class Update{

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
            String query =String.format("UPDATE students SET marks = %f WHERE id =%d",56.5,2);
            int rowsAffected = statement.executeUpdate(query);
            if (rowsAffected>0) {
            	System.out.println("Data Updated Successfully!!!!");
            }
            else {
            	System.out.println("No Data Updated!!!");
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
