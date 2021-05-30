package com.vm.training.java.basics;
import java.util.Scanner;

public class Assignmentseven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sum = 0;
        System.out.println("Enter 5 numbers : ");
	    for(int i=1;i<=5;i++)
	    {
	        num  =sc.nextInt();
	         sum = sum + num;
	    }
	    System.out.println("The sum of 5 no is : "+sum);
	    System.out.println("The Average is : "+(float)(sum/5)); 
    }

	}
