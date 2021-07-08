package com.vm.java.traning.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Wrestler{
	public static void main(String[] args) {
		ArrayList<WWE> wrestlers = new ArrayList<WWE>();
		wrestlers.add(new WWE("Jack","Orton", 185));
		wrestlers.add(new WWE("Thomson", "Taker", 215));
		wrestlers.add(new WWE("Jade", "lesnar", 250));
		wrestlers.add(new WWE("Sheer", "Cena", 192));
		long count = wrestlers.stream().count();
		System.out.println("No of wrestlers :"+count);
		long  wsum = wrestlers.stream().filter(p->p.getWeight()>200).map(p->p.getWeight()).reduce(0,(A,B)->A+B);
		 System.out.println(" Sum of their weights > 200 : "+wsum);
		 System.out.println("FirstName : ");
		 printFirstName(wrestlers).forEach(p->System.out.println(p));
		 System.out.println(" sorted list by firstname :");
		 sortbyFirstName(wrestlers).forEach(p->System.out.println(p.getFirstName()));
	 
	}
	private static List printFirstName(List <WWE> list)
	{
		 return list.stream().map(p->p.getFirstName()).collect(Collectors.toList());
		
	}
	private static List<WWE> sortbyFirstName(List <WWE> list)
	{
		 return list.stream().sorted(Comparator.comparing(WWE::getFirstName)).collect(Collectors.toList());
	}
	}



}
