package com.vm.training.java.date;

import java.time.LocalDate;

public class DateCalculator {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println("today :" +today);
		System.out.println("tomorrow : " +today.plusDays(1));
		System.out.println("after two weeks :" +today.plusWeeks(2));
		System.out.println("after one month: "+today.plusMonths(1));
		System.out.println("after one year: " +today.plusYears(1));
		
		LocalDate bookingdate=  LocalDate.of(2021, 05,31);
		if(bookingdate.isAfter(today))
		{
			System.out.println("correct date you can book");
		}
		else {
			System.out.println("invalid date booking date cannot be previous");
		}
	}
}
		
		
		

