package com.vm.training.java.jdbc;

public class JdbcDemo {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.vm.training.java.jdbc.A");
			
		} catch (Exception e) {
			e.printStackTree();
			
		}
		
	}

}
