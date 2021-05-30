package com.v.java.training.exceptions;

public class MinBal extends Exception {

	String message;
	MinBal(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return message;
	}
	
}



