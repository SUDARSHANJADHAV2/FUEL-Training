package JDBC;
import java.sql.*;
import java.util.*;
public class PrintTable{

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

        try (
        	    Connection connection = DriverManager.getConnection(url, username, password);
        	    Statement statement = connection.createStatement();
        	    ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
        	) {
        	    while (resultSet.next()) {
        	        int id = resultSet.getInt("id");
        	        String name = resultSet.getString("name");
        	        int age = resultSet.getInt("age");
        	        double marks = resultSet.getDouble("marks");

        	        System.out.println("id : " + id);
        	        System.out.println("name : " + name);
        	        System.out.println("age : " + age);
        	        System.out.println("marks : " + marks);
        	    }
        	}

        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
