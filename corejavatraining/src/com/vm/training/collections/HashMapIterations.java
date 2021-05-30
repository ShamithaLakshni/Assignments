package com.vm.training.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapIterations {
	
	    public static void main(String a[]){
	        HashMap<String, String> hm = new HashMap<String, String>();
	        //add key-value pair to hashmap
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	        Set<String> keys = hm.keySet();
	        for(String key: keys){
	            System.out.println("Value of "+key+" is: "+hm.get(key));
	        }
	    }
	}

