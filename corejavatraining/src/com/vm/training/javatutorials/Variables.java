package com.vm.training.javatutorials;

public class Variables {
	int a = 10; //this is the instance variable
	static int b =11;//this is the static variable which can be accessed directly
	public static void main(String[] args) {
		
		int  c = 12;//this is the local varibale
		
		Variables v = new Variables();//creation of object for the class variable
		System.out.println(v.a);//it needs a object to be created and then accesss
		
		System.out.println(b);
		System.out.println(c);;
		
	}

}
