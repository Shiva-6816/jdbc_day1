package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePerson {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load and Register The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the Connection with DataBase(my sql)

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person_db", "root", "root");

		// Create the statemant
		Statement statement = connection.createStatement();

		// Execute the Statement
		statement.execute("update person set age=40 where id=2");

		// close the connection with Database
		connection.close();

		System.out.println("sucessfulluy Updateed the data in DataBase");
	}

}
