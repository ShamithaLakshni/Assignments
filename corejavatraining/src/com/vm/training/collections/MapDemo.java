package com.vm.training.collections;

import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        //add key-value pair to hashmap
        hm.put(1, 123);
        hm.put(2, 456);
        hm.put(3, 789);
        hm.put(4, 8888);
        System.out.println(hm);
        //getting value for the given key from hashmap
        System.out.println("Value of second: "+hm.get("second"));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the HashMap: "+hm.size());
		
		
		
	}

}
