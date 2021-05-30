package com.vm.java.training.strings;

public class StringObjectCreation {

 public static void main(String[] args) {
	 String s1 = new String("Valuemomentum");
	 String s2 = "Valuemomentum";
		
		String s3= new String ("VALUEMOMENTUM");
		String s4="VALUEMOMENTUM";
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		

	    System.out.println( s1==s2 );
	    System.out.println( s1.equals(s2));
	    System.out.println( s1.toUpperCase());
	    System.out.println( s1.charAt(11));
	    System.out.println( s1.intern()); 
	    System.out.println(s1==s3);
	    
}
}
