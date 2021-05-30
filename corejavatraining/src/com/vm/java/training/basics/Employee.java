package com.vm.java.training.basics;

public class Employee {

		//program for use of toString()
		//toString() is predifined method
		int id;
		String name;
		String dept;
		Employee(){
			
		}
		public Employee(int id, String name, String dept) {
			super();
			this.id = id;
			this.name = name;
			this.dept = dept;
		}
		//we no need to create method to access variables.where toString() directly sends variables to object
		/*public String toString() {
			return id+" "+name+" "+dept;
		}*/
		/*public static void main(String[]args)
		{
			Employee1 e=new Employee1();
			Employee1 e1=new Employee1(100,"abc","cse");
			System.out.println(e);
			System.out.println(e1);
		}*/
	}

