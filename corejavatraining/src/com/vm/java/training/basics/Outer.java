package com.vm.java.training.basics;

public class Outer {

		static int i=100;
		void show()
		{
			System.out.println(i);
		}
		
		class Inner{
			int a=200;
			void display() {
				show();
				System.out.println(i);//i can also be non static
			}
		}
	}

