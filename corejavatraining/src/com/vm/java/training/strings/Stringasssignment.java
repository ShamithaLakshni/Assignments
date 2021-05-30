package com.vm.java.training.strings;

public class Stringasssignment {
	public static void main(String[] args) {
		String str = "    Value       Momentum       ";
		String noSpaceStr = str.replaceAll("\\s", ""); 
		
		System.out.println(noSpaceStr);
		
	}

}
