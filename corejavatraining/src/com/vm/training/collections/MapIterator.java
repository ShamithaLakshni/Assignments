package com.vm.training.collections;

import java.util.LinkedHashMap;

public class MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap hm = new LinkedHashMap();
		hm.put("sachin","batsman");
		hm.put("rahul","coach");
		hm.put("sachin","batsman");
		hm.put("dhoni","wk");
		System.out.println("linedhashmap"+hm);
		
		System.out.println(hm.get("sachin"));
		//System.out.println("afterremoving"+hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());

	}

}