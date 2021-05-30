package com.v.java.training.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] i= {1,2};
			System.out.println(i[2]);
		}
		catch(Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}
	}

}