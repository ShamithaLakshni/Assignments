package com.v.java.training.exceptions;

	public class ProductDamaged extends Exception {
		 
		String message;
		ProductDamaged(String message)
		{
			this.message=message;
		}
		
		public String toString() {
			return message;
		}
	}

