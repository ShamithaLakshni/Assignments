package com.vm.java.training.concurrency;

import java.util.HashMap;

public class ConcurrentHashMapDemo {
	
	
			public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			HashMap<String,Integer> hm=new HashMap<String ,Integer>();
			hm.put("shami",05);
			hm.put("sham", 20);
			hm.put("sha",30);
			System.out.println("elements in hashmap"+hm);

			hm.computeIfAbsent("shami", a->90);
			System.out.println("added elements on map"+hm);

			System.out.println(hm.containsKey(30));
		}

	}



