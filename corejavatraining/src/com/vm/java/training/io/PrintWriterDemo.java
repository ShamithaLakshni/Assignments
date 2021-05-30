package com.vm.java.training.io;

import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.write();
		pw.write();
		
		pw.flush();
		pw.close();
		
		
		
		
		
	}

}
