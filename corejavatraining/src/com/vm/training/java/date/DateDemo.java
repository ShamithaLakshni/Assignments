package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		System.out.println("date is  :" +todayDate);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("time is :"  +dateTime);
		
		
		
	}

}
