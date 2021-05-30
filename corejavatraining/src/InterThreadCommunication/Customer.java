package InterThreadCommunication;

public class Customer {
	int balance = 5000;
	 synchronized public int withdraw(int amount)
	{
		 if(balance<amount) {
			 System.out.println("insufficient funds");
		 }
		 try {
			 wait();
		 }catch(InterruptedException e) {
			 
		 }
		 		 
		 
		return amount;
		
	}
	
	
	
	
	
	

}
