package com.vm.training.java.basics;
public class Cafeteria {
		private double price;
		private String item;
		
		public String Coffee(int q)
		{
			this.price= 50.00;
			this.item="Coffee";
			return this.item+","+String.valueOf(q*this.price);
			
		}
		public String Espresso(int q)
		{
			this.price= 100.00;
			this.item="Espresso";
			return this.item+","+String.valueOf(q*this.price);
			
		}
		public String WhiteCoffee(int q)
		{
			this.price= 80.00;
			this.item="White Coffee with Milk";
			return this.item+","+String.valueOf(q*this.price);
			
			
		}
		public String Cappucchino(int q)
		{
			this.price= 140.00;
			this.item="Cappucchino";
			return this.item+","+String.valueOf(q*this.price);
			
		}
		public String Tea(int q)
		{
			this.price= 30.00;
			this.item="Tea";
			return this.item+","+String.valueOf(q*this.price);
			
		}

	}


