package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded");

			//step 2
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy2?autoReconnect=true&useSSL=false\r\n"
					+ "","root","admin");
			System.out.println("Connected");
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
			ps.setInt(1, 8);
			ps.setString(2, "shamitha");
			ps.setString(3, "1998-09-08");
			ps.execute();
			System.out.println("inserted");
	}
		catch(Exception e) {
System.out.println(e);
}
	}
}

