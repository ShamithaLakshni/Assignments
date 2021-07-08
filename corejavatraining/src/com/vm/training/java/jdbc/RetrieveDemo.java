package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class RetrieveDemo {
	public static void main(String[] args) {
		try {
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded");

			//step 2
	Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy2?autoReconnect=true&useSSL=false\r\n"
					+ "","root","root");
			System.out.println("Connection Established");


		Statement stmt =(Statement) con1.createStatement();
		ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from products");
		System.out.println("inserted");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}

	