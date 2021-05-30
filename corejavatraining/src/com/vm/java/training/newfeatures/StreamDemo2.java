package com.vm.java.training.newfeatures;
import java.util.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> ar=new ArrayList();

		ar.add(new Employee(1,"shamitha","cse",50000,25));
		ar.add(new Employee(2,"lakshmi","dev",27000,28));
		ar.add(new Employee(3,"john","ece",30000,32));
		ar.add(new Employee(4,"thanvi","test",32000,45));
		ar.add(new Employee(5,"sam","hr",80000,40));

		ar.forEach(System.out::println);

		long count=ar.stream().count();
		System.out.println("count of employees is :"+count);

		System.out.println(" print only developer");
		ar.stream().filter(s->s.getDept().equalsIgnoreCase("dev")).forEach(s->System.out.println(s));


		System.out.println("print the details that starts with s");

		ar.stream().filter(s->s.getName().startsWith("s")).forEach(s->System.out.println(s));
		
		System.out.println("count the employees salary greater than 50000");
		
		System.out.println(ar.stream().filter(s->s.getSalary()>50000).count());
		List <Employee> emp = ar.stream().sorted((o1,o2)->
		{
			return o1.getName().compareTo(o2.getName());
			}).collect(Collectors.toList());
		System.out.println("sorting by name");
		emp.forEach(System.out::println);
		System.out.println("sorting by salary");
		emp.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		System.out.println("sorting by salary reverse");
		emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		
		
		
		
		long s1=ar.stream().filter(s->s.getDept().equals("hr")).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println("salary of hr "+ s1);
      List<Employee> uniqueEmp =ar.stream().distinct().collect(Collectors.toList());
      uniqueEmp.forEach(System.out::println);
      
      long sk = 3;
      ar.stream().skip(sk).forEach(System.out::println);
      long l = 2;
      ar.stream().limit(l).forEach(System.out::println);
	}
}
