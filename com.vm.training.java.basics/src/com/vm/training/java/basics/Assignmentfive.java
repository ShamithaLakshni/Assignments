package com.vm.training.java.basics;
import java.util.Scanner;

public class Assignmentfive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year :");
	    int year = sc.nextInt(); 
        if ((year % 400 == 0) || (year % 4 == 0) ) {
                    if(year % 100 != 0)
                    {
                        System.out.println(year +" is a leap year");
                    }
                    else{
                        System.out.println(year +"is not a leap year");
                    }
                    
                }    
}
}