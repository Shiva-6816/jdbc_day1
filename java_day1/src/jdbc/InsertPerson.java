package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPerson {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// load and Register The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the Connection with DataBase(My SQL)

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person_db", "root", "root");

		// Create the statement
		Statement statement = connection.createStatement();

		// Execute the Statement
		statement.execute("insert into person values(1,'SHIVA',23,9573576372,'Hyderabad')");
 
		// close the connection with Database
		connection.close();
		
		System.out.println("sucessfulluy inserted into DataBase");

	}

}
