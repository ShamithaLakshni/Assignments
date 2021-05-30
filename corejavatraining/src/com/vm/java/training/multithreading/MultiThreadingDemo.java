package com.vm.java.training.multithreading;

public class MultiThreadingDemo {
	class Shamitha extends Thread{
		public void run()
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("shamitha "+i);
			}
		}
	}
	class Shamith extends Thread{
		public void run()
		{
			for(int i=11;i<=20;i++)
			{
				System.out.println("shamith "+i);
			}
		}
	}
	class Shami extends Thread{
		public void run()
		{
			for(int i=21;i<=30;i++)
			{
				System.out.println("shami "+i);
			}
		}
	}

	public static void main(String[] args) {
		
			Shamitha  s1 = new Shamitha();
			Shamith  s2 = new Shamith();
			Shami  s3 = new Shami();
			
			/*s1.run();
			s2.run();
			s3.run();*/
			s1.start();
			s2.start();
			s3.start();
		}

	}

