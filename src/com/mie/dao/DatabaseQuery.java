package com.mie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mie.util.DbUtil;


public class DatabaseQuery {
	
	private Connection connection = DbUtil.getConnection();

	public boolean runUpdate(String qStr) {
			
		String queryString = qStr;
		boolean result = false;
		Statement statement;
		PreparedStatement preparedStatement;
		if (connection == null) {
			return result;
		}
		try {
			statement = connection.createStatement();
			preparedStatement = connection.prepareStatement(queryString);
			preparedStatement.execute();
			result = true;
			statement.close();
			
		} catch (SQLException se) {
			
			se.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	
}
