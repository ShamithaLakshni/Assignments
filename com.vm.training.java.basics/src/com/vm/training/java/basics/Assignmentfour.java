package com.vm.training.java.basics;
import java.util.Scanner;

public class Assignmentfour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int NumberOfDaysInAMonth = 0;
        String MonthOfName = "";

        System.out.print("Input a month number : ");
        int month = sc.nextInt();

        System.out.print("Input a year: ");
        int year = sc.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                NumberOfDaysInAMonth= 31;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                	NumberOfDaysInAMonth = 29;
                } else {
                	NumberOfDaysInAMonth = 28;
                }
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
            case 3:
                MonthOfName = "March";
                NumberOfDaysInAMonth = 31;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
            case 4:
                MonthOfName = "April";
                NumberOfDaysInAMonth= 30;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
            case 5:
                MonthOfName = "May";
                NumberOfDaysInAMonth = 31;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
            case 6:
                MonthOfName = "June";
                NumberOfDaysInAMonth = 30;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
            case 7:
                MonthOfName = "July";
                NumberOfDaysInAMonth = 31;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
            case 8:
                MonthOfName = "August";
                NumberOfDaysInAMonth = 31;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth+ " days\n");
                break;
            case 9:
                MonthOfName = "September";
                NumberOfDaysInAMonth = 30;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
            case 10:
                MonthOfName = "October";
                NumberOfDaysInAMonth = 31;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
            case 11:
                MonthOfName = "November";
                NumberOfDaysInAMonth = 30;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
            case 12:
                MonthOfName = "December";
                NumberOfDaysInAMonth = 31;
                System.out.print(MonthOfName + " " + year + " has " + NumberOfDaysInAMonth + " days\n");
                break;
        } 
    }
	
	}

