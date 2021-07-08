package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class MySqlConnection {
		public static void main(String [] args)
		{

			try {
				//step 1
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver class loaded");

				//step 2
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy2?autoReconnect=true&useSSL=false\r\n"
						+ "","root","root");
				System.out.println("Connection Established");


				Statement stmt =(Statement) con1.createStatement();
				stmt.execute("insert into product values(4,'charge',400,'electronics')");
				System.out.println("inserted");
				}
				catch(ClassNotFoundException e) {
					e.printStackTrace();
					

			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}


		}
	}
	