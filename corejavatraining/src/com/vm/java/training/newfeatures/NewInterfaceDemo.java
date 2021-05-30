package com.vm.java.training.newfeatures;

 interface Banks{
	default void openAccount()
	{
		System.out.println("account created");
	}
	static  void hoiliday()
	{
		System.out.println("tomorrow is a holiday");
	}
	abstract int rateOfInterest(int interest);
	abstract int minBalance(int amount);
}
class IndianBank implements Banks{

	@Override
	public int rateOfInterest(int interest) {
		
		return 0;
	}

	@Override
	public int minBalance(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class NewInterfaceDemo {
public static void main(String[] args) {
	Banks bank = new IndianBank();
	bank.openAccount();
	System.out.println("minimun balance" + 500);
	System.out.println("rateofinterest" + 4);
}
}
