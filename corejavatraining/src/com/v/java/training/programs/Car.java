package com.v.java.training.programs;

public class Car { 
		private int YearModel;
		private String Make;
		private int Speed=0;
		public Car(int yearModel, String make) 
		{
			super();
			YearModel = yearModel;
			Make = make;
		}
		
		public int getYearModel() {
			return YearModel;
		}

		public void setYearModel(int yearModel) {
			YearModel = yearModel;
		}

		public String getMake() {
			return Make;
		}

		public void setMake(String make) {
			Make = make;
		}

		public int getSpeed() {
			return Speed;
		}

		public void setSpeed(int speed) {
			Speed = speed;
		}

		public int Accelerate()
		{
			int val=5;
			Speed=Speed+val;
			return Speed;
		}
		public int Brake()
		{
			int val1=5;
			if(Speed>5)
			{
			Speed=Speed-val1;
			
			return Speed;
			}
			else
			{
				return 0;
			}
		}


public static void main(String[] args)
{
	// TODO Auto-generated method stub

	
	
	Car c=new Car(1965, "Bat Mobile");
    
    System.out.println(c.Accelerate());
    System.out.println(c.Accelerate());
    System.out.println(c.Accelerate());
    System.out.println(c.Accelerate());
    System.out.println(c.Accelerate());
    
    System.out.println(c.Brake());
    System.out.println(c.Brake());
    System.out.println(c.Brake());
    System.out.println(c.Brake());
    System.out.println(c.Brake());
    System.out.println(c.Brake());

}

}

