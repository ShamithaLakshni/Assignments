package com.vm.java.training.newfeatures;

public class MethodReferenceDemo {
	interface Validate
	{
		void validateLogin();
			
		}
	class Car{
		void myLogin() {
			System.out.println("my login uname and pwd" );
		}
	}
	public static void main(String[] args) {
		Validate v = ()->System.out.println("login valid" );
		v.validateLogin();
		

		
		
		
	}

}
