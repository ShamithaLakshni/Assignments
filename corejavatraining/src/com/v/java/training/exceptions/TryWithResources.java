package com.v.java.training.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
	public class TryWithResourcesTest {
		public void main(String[] args)
		{
			try(FileOutputStream fos = new FileOutputStream(new File("")))
			{
				String s ="ValueMomentum";
				byte[] by = s.getBytes();
				fos.write(by);
				System.out.println("success");
				
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
		}
	}
}
