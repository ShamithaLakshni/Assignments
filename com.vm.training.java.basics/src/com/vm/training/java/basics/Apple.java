package com.vm.training.java.basics;

public class Apple extends Samsung{
	public static void main(String[] args) {
		Apple m= new Apple();
		m.wifi();
		m.video();
		m.bluetooth();
		m.camera();
		m.scamera();
		
	}

	@Override
	public void wifi() {
		System.out.println("hi apple");
		// TODO Auto-generated method stub
		
	}
	
	
	

}
