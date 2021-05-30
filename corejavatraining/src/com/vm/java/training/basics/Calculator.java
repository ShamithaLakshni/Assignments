package com.vm.java.training.basics;

public class Calculator {
		  int a;
		  String b;
		  double f;
			  public Calculator()
			  {
				  System.out.println("undefined");
			  }
			 public Calculator(int a,String b)
			 {
				 this.a=a;
				 this.b=b;
			 }
			 public Calculator(int a,String b,double f)
			 {
				 this.a=a;
				 this.b=b;
				 this.f=f;
			 }
			
				 public static void main(String[]args) {
				 	Calculator c= new Calculator();
				 	Calculator s= new Calculator(1,"a");
				 	
				 }
				 }
