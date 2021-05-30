package com.v.java.training.exceptions;
import java.io.*;
public class FileNotFound{
public static void main(String[] args) {
	File file=new File("C:\\prem\\prem.txt");
	FileInputStream fis=null;
	try {
		fis=new FileInputStream(file);
		while(fis.read()!=-1)
		{
			System.out.println(fis.read());
		}
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	finally {
		try{
			fis.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
}