package com.vm.training.java.basics;
import java.util.Scanner;

public class Assignmenteleven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int num1=0,num2=1,num3,i,n;  
     System.out.print("Input the number: ");
     n=sc.nextInt();
for(i=2;i<n;++i)
{    
num3=num1+num2;    
System.out.print(" "+num3);    
num1=num2;    
num2=num3;    
}
}
}