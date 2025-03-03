package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllPerson {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person_db", "root", "root");

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("select * from person");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getInt(3));
			System.out.println(resultSet.getLong(4));
			System.out.println(resultSet.getString(5));
			System.out.println("*************************");
		}
		connection.close();
		System.out.println("sucessfully data fetched from db");

	}

}
