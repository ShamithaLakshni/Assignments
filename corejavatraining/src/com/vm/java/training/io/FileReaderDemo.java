package com.vm.java.training.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		
		File f = new File("shamitha.txt");
		FileReader fr = new FileReader();
		int readChar = f.read();
		
		
	}

}
