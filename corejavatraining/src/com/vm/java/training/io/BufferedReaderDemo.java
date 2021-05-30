package com.vm.java.training.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("shamitha.txt");
		BufferedReader br = new BufferedReader(br);
		
		br.read("hello");
		br.read("hii");
		br.read("abc");
		
		br.flush();
		br.close();
		System.out.println("");
		
		
		
		
	}
	

}
