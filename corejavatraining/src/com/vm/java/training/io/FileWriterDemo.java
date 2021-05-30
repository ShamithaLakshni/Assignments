package com.vm.java.training.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
public static void main(String[] args) throws IOException {
	//File f = new File("shamitha.txt");
	
	//FileWriter fw = new FileWriter(f);
	FileWriter fw = new FileWriter(new File("shamtha.txt"));
	
	fw.write("hi");
	fw.write("hello");
	fw.write(5746);
	
	//fw.flush();
	//fw.close();
	System.out.println("data written");
	
}
}
