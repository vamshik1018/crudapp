package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtility {

	public static Connection getDBConnection() {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
			connection = DriverManager.getConnection("jdbc:mysql://10.10.0.50:3306/simpleAppDB", "crudapp", "crudapp");
=======
			connection = DriverManager.getConnection("jdbc:mysql://10.10.0.50:3306/simpleAppDB", "myuser", "Training@Jn1t");
				   //DriverManager.getConnection("jdbc:mysql://localhost:3306/simpleAppDB", "root", "Training@Jn1t");
>>>>>>> da02e0bc5f496da7223dff922fb5bb8c36ef181d
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;

	}
}
