package com.vm.training.java.basics;

import java.util.Scanner;

public class Assignmentfifteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Long number;
       int noofDigits=0;
       System.out.print("Input an integer number less than ten billion:");
       number=sc.nextLong();
       while(number>0)
       {
           number=number/10;
           noofDigits++;
       }
       System.out.println(" Number of digits in the number: "+noofDigits);
}
}