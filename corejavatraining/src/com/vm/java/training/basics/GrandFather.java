package com.vm.java.training.basics;

public class GrandFather {
		int age;
		 GrandFather(int age)
		{
			this.age=age;
		}
		void walk()
		{
			System.out.println("GrandFather");
		}
		}

		class Father extends GrandFather
		{
			int myAge;
			 Father(int myAge,int age)
			{
				 super(age);
				this.myAge=myAge;
			}
			 void walk()
			 {
			 	System.out.println("Father");
			 }
		}
		class Son extends Father
		{
			int sage;
			 Son(int sage,int myAge,int age)
			{
				 super(age,myAge);
				this.sage=sage;
			}
			 void walk()
			 {
			 	System.out.println("son");
			 }
		
		
			public static void main(String[] args) {
				Son s=new Son(20,30,40);
				s.walk();
				GrandFather f=new Son(12,24,42);
				f.walk();
			}
			}
