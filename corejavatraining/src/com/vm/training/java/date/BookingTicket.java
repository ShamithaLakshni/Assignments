package com.vm.training.java.date;

import java.time.LocalDate;
import java.util.Scanner;

public class BookingTicket {
	 public static void main(String[] args) {
		  LocalDate today=LocalDate.now();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the date to be booked in format(yyyy-mm-dd)");
		  String str=sc.nextLine();
		  LocalDate ld=LocalDate.parse(str);
		  if(ld.isAfter(today))
		  {
		   System.out.println("Your  ticket is booked successfully on "+ld);
		  }
		  else
		  {
		   System.out.println("Unable to book your ticket(date cannot be prevuios) ");
		  }
		 }
		}

