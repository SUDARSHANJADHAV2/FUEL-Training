package JDBC;
import java.util.*;
import java.sql.*;
public class RetriveDataUsingPerparedStatement {
	private static final String url="jdbc:mysql://localhost:3306/myDB";
	private static final String username ="root";
	private static final String password ="Admin@123";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			String query ="SELECT marks FROM students WHERE id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,3);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println("Marks : "+resultSet.getDouble("marks"));
			}
			else {
				System.out.println("Marks not found");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
