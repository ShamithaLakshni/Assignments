package com.v.java.training.exceptions;

	public class Balance extends Exception{

		String message;
		Balance(String message)
		{
			this.message=message;
		}

		@Override
		public String toString() {
			return message;
		}
		
	}


