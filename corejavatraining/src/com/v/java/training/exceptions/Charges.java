package com.v.java.training.exceptions;
	
	public class Charges extends Exception {

		String message;
		Charges(String message)
		{
			this.message=message;
		}
		
		public String toString() {
			return message;
		}
	}

