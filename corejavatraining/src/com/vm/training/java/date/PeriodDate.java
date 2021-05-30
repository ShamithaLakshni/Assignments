package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDate {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate joiningdate = LocalDate.of(2021,05,05);
		
		Period period = Period.between(joiningdate,today);
		System.out.println("year "+period.getYears,"month "+ period.getMonths,"date" + period.get);
		
		
		
		
		
		
		
		
		
		
	}

	

}
