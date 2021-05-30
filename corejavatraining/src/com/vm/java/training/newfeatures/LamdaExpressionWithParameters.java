package com.vm.java.training.newfeatures;

interface Calculate{
	void addition(int a,int b);
}
@FunctionalInterface
interface Calculate1{
	int multiply(int a,int b);
}
@FunctionalInterface
interface largeNumber{
	int findLargeNumber(int a,int b);

 static void subtract()
 {
	 System.out.println("shamitha");
 }
public class LamdaExpressionWithParameters {
	
	public static void main(String[] args) {
		
		Calculate c = (e,f)-> System.out.println("addition :"+ (e+f));
		c.addition(2,4);
		Calculate1 c1 = (a,b)-> System.out.println("multiply :"+ (a*b));
		System.out.println("multiply :"+ c1.multiply (2, 4));
		c1.multiply(4,8);
		
		
		
		Large large = (a,b)->
		if (a>b)
			return a;
		
		else {
			return b;
		}
	}

}
