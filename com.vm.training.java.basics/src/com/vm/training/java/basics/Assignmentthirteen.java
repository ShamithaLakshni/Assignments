package com.vm.training.java.basics;
import java.util.Scanner;

public class Assignmentthirteen {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
     System.out.print("Input the number: ");
    int range1=sc.nextInt();
    int range2=sc.nextInt();
     do{
         System.out.print(range1+" ");
         range1++;
     }while(range1<=range2);
}
}