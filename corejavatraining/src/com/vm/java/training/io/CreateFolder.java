package com.vm.java.training.io;

import java.io.File;

public class CreateFolder {
	public static void main(String[] args) {
		
		File f = new File("movies");
		System.out.println(f.exists());
		f.mkdir();//creates a new file
		System.out.println(f.exists());
		
		
		
		
		
	}

}
