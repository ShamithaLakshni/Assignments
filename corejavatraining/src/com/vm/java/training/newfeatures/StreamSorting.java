package com.vm.java.training.newfeatures;

import java.util.ArrayList;

public class StreamSorting {
	public static void main(String[] args) {
		
		ArrayList<Integer>  nums = new ArrayList<Integer>();
		
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		
		nums.forEach(System.out::println);
		System.out.println("-----sort-----");
		nums.stream{}.sorted().forEach(System.out::println);
		
		
	}

}
