package com.vm.java.training.newfeatures;
class Bank{
	void rateOfInterest()
	{
		System.out.println("2%");
	}

void loan()
{
	System.out.println("you are eligible for loan");
}
}
	
class Axis extends Bank{
	void rateOfInterest()
	{
		System.out.println("4%");
	}
	void loan()
	{
		System.out.println("you are not  eligible for loan");
	}
	
}
class Indian extends Bank{
	void rateOfInterest()
	{
		System.out.println("8%");
	}
}

public class OverRidingDemo {
	public static void main(String[] args) {
		Bank bank = new Indian();
		bank.rateOfInterest();
		bank.loan();
	}

}
