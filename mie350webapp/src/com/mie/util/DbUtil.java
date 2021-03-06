package com.mie.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
	/**
	 * This class handles the database connection.
	 * 
	 * DO NOT modify this file unless you have set a username and password to
	 * your database files. (This is not needed if you have created your
	 * database files with Microsoft Access.
	 */

	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection != null)
			return connection;
		else {
			try {
				Properties prop = new Properties();
				InputStream inputStream = DbUtil.class.getClassLoader()
						.getResourceAsStream("/db.properties");
				prop.load(inputStream);
				String driver = prop.getProperty("driver");
				System.out.println(driver);
				String url = prop.getProperty("url");
				System.out.println(url);
				String user = prop.getProperty("user");
				System.out.println(user);
				String password = prop.getProperty("password");
				System.out.println(password);
				Class.forName(driver);
				
				connection = DriverManager.getConnection(url, user, password);
				
			} catch (ClassNotFoundException e) {
				System.out.println("Driver Problem");
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("path Problem");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return connection;
		}

	}
}