package com.vm.training.java.basics;

public class Operators {
int i = 10;
int x;
int j= 20;
int z= 20;
void add() {
	System.out.println(x=  i+j);
	System.out.println("adding");

//	30//
	x= i-j;
	System.out.println(x=  i-j);
	System.out.println("diffenernce");
	//-10
	x=i*j;
	System.out.println(x=  i*j);
	System.out.println("multiplication");
	//200
	x=i/j;
	System.out.println(x=  i/j);
	System.out.println("division");
	//0.5 float value so 0
	x=i++;
	System.out.println(x=  i++);
	System.out.println("inceremnet");
	//11
	x=j--;
	System.out.println(x=  j--);
	System.out.println("decerement");
	//19
	x=i%j;
	System.out.println(x=  i%j);
	System.out.println("modulus");
	//0 x=10%20
	i+=i;
	System.out.println(i+=i);
	System.out.println("direct adding by i");
 
	//11 i=i+i i = 
	
	z+=z;
	System.out.println(z);
	
	
 }
public static void main(String[] args) {
	Operators op = new Operators();
	op.add();
	System.out.println(op.i);
	
}
}
