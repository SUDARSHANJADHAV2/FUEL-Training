package JDBC;
import java.sql.*;

public class UpdateUsingPreparedStatement {
	private static final String url="jdbc:mysql://localhost:3306/myDB";
	private static final String username="root";
	private static final String password="Admin@123";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			String query ="UPDATE students marks =? WHERE id =?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDouble(1,80.0);
			preparedStatement.setInt(2,3);
			int rowsAffected = preparedStatement.executeUpdate();
			if(rowsAffected>0) {
				
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
