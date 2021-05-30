package com.vm.training.javatutorials;

//default constructors will not have any arguments passed . 
//if they are not initialized they defaultly take null or 0 values

public class Constructors {  //ex of default constructor
	
		String name;
		int id; /// only declaring the variables and not initializing them
		int age;
		Constructors()     //constructor block
		{
			name = "Shamitha"; //initializing the objects 
			id=  5746;
			age= 22;
		}
		Constructors(String str,int num) //parameterized constructor
		{
			name =  str;
			id =  num;
		}
		
		public static void main(String[] args) {
		
		Constructors c = new Constructors();///object creation for first constructor
		Constructors c1 = new Constructors("lakshmi",540);///object creation for second constructor
		
		System.out.println(c.name);//acessing through the object created
		System.out.println(c.id);
		System.out.println(c.age);
		
		System.out.println(c1.name);//accessing second object
		System.out.println(c1.id);
		
		
		//example for default constructor
		
		
		
	}

}
