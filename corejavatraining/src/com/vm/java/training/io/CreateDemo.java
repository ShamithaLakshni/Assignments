package com.vm.java.training.io;

import java.io.File;
import java.io.IOException;

public class CreateDemo {
	public static void main(String[] args) throws IOException {
		
		File f = new File("shamitha.txt");
		
		if(f.exists()) {
			System.out.println("the file is present");
		}
		else
		{
			System.out.println("file is not present");
			f.createNewFile();
			System.out.println("file is created");
		}
		
		
		
		
		
		
		
	}

}
