package com.vm.training.java.basics;
import java.util.Scanner;

public class Assignmenttwelve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
     System.out.print("Input the number: ");
    int n=sc.nextInt();
     int sum=0;
     while(n>0)
     {
         int num=sc.nextInt();
         if(num>0)
         {
             sum=sum+num;
         }
         n--;
     }
     System.out.println(sum);
    }
}
