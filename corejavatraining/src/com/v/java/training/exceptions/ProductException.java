package com.v.java.training.exceptions;

	public class ProductException extends Exception {
		String message;
		ProductException(String message)
		{
			this.message=message;
		}
		
		public String toString() {
			return message;
		}
	}