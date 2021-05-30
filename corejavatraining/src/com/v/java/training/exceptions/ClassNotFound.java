package com.v.java.training.exceptions;
public class ClassNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
       Class.forName("Hm");
       System.out.println("found class");
	}catch (ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	}

}