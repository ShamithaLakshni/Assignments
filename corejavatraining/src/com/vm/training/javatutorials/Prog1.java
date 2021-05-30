package com.vm.training.javatutorials;

import java.util.Scanner;

public class Prog1{
	
	//input from the user and to print natural numbers
	     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upto which number you want the series to be pinted: ");
		int number = sc.nextInt();
		for(int i = 1;i<=number;i++)
		{
			
			System.out.print(i +" ");
		}
	}
}

	/*method two
	 public static void main(String[] args) {
		 System.out.println("The natural numbers are:"); 
		for(int i=1;i<=20;i++) {
			System.out.print(i +" "); 
			
			
		}
	}
	
	
	
	

}  */
