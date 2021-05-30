package com.vm.java.training.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffredWriterDemo {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("shamitha.txt");
	BufferedWriter bw = new BufferedWriter();
	 bw.write("hello");
	 bw.newLine();
	 bw.write("hiii");
	 bw.newLine();
	 
	 bw.flush();
	 bw.close();
	 System.out.println("data written");
	 
	 
	 

	
	
	
}
}
