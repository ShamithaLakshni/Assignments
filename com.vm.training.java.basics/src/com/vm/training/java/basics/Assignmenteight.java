package com.vm.training.java.basics;

import java.util.Scanner;

public class Assignmenteight {
	public static void main(String[] args) {
	System.out.println();
    int number1; 
System.out.println("enter the number of terms : ");
Scanner sc = new Scanner(System.in);
int number= sc.nextInt();
for(int i=1;i<=number;i++)
{
number1= sc.nextInt();
System.out.println("Number is :"+number1+" and cube of"+number1+" is "+(number1*number1*number1));
}
}
}