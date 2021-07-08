package com.vm.java.traning.test;

import java.util.Scanner;

public class EmployeeMain {

		public static void main(String[] args) throws LengthException {
			
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.print("enter firstname : ");
	    String firstname=sc.next();
	    System.out.print("enter lastname : ");
	    String lastname=sc.next();
			
			EmployeeTest emp=new EmployeeTest(firstname,lastname);
			
			emp.Validation();
			
		}

	}

