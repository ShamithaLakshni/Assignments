package com.vm.java.training.io;

	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

	public class BuffrerWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("shamitha.txt");
		BufferedWriter bw = new BufferedWriter();
		
		 bw.write("id" + "name" + "age");
		 
		 
		 
		 bw.newLine();
		 bw.write("hiii");
		 bw.newLine();
		 
}
