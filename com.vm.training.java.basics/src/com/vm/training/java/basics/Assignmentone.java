package com.vm.training.java.basics;

import java.util.Scanner;

public class Assignmentone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		int n= sc.nextInt();
		if(n>0) {
			System.out.println("positive number");
		}
		if(n<0){
			System.out.println("negative number");
		}
		else {
			System.out.println("zero");
		}
	
	}

}
