package com.vm.java.traning.test;

import java.util.Scanner;

public class WordCount {
		public static void main(String[] args) {
			System.out.println("Enter the String: ");
			
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			int len=str.length();
			int a=0; int b=0;
			for(int i=0;i<len;i++)
			{
				b++;
				if(str.charAt(i)==' ')
				{
				  a++;	
				}
					
			}
			a=a+1;
			
			System.out.println("Word->"+a);
			System.out.println("Character->"+b);

		}

	}
		



