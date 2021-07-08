package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		public static Connection getConnection() throws SQLException, ClassNotFoundException
		{
			
			Class.forName(JDBCProperties.DRIVER_CLASS);
			return DriverManager.getConnection(JDBCProperties.URL,JDBCProperties.USERNAME,JDBCProperties.PASSWORD);
			
			
		}

	}

}
