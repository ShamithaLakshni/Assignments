package com.vm.java.training.newfeatures;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmployeeStream {
		long countOfEmployee(ArrayList<Employee> emplist)
		{
			return emplist.stream().count();
		}
		
//		static List<Employee> getDeveloper(ArrayList<Employee> emplist)
//		{
//			return emplist.stream().filter(s->s.getDept())
//		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ArrayList<Employee> employees=new ArrayList<Employee>();
			
			employees.add(new Employee(1,"prem","cse",23000,21));
			employees.add(new Employee(2,"kumar","ece",22000,23));
			employees.add(new Employee(3,"battineni","ecm",34000,20));
			employees.add(new Employee(4,"vamsi","mech",24000,42));
			employees.add(new Employee(5,"kedari","eee",23000,21));
			
			employees.forEach(System.out::println);
			
			long employeecount=employees.stream().count();
			System.out.println("total employees");
			
			//prints employees whose dept is cse
			employees.stream().filter(s->s.getDept().equals("cse")).forEach(System.out::println);
			
			//prints employees whose name starts with p
			System.out.println("a");
			employees.stream().filter(s->s.getName().startsWith("p") ).forEach(p->System.out.println(p.getName()));

			long empcountofsalary=employees.stream().filter(s2->s2.getSalary()>5000).count();
			
	       System.out.println(empcountofsalary);
	       
	       System.out.println();
	       System.out.println("length");
	       employees.stream().map(m->m.getName().length()).forEach(System.out::println);
	       employees.stream().map(m->m.getSalary()+" "+m.getSalary()+" "+m.getId()).forEach(System.out::println);
	       
	       
	       System.out.println("salary");
	       employees.stream().map(m->m.getSalary()+" "+((m.getSalary()*0.20)+m.getSalary())+"  "+m.getName()+" "+m.getName().length()).forEach(System.out::println);

	       List<Employee> e=employees.stream().filter(s->s.getDept().equals("cse")).collect(Collectors.toList());
	       
	      
	       e.forEach(a->System.out.println(a));
	             //OR if want with specific values
	       //e.forEach(a->System.out.println(a.getSalary()+" "+a.getDept()));
	       System.out.println("Sorting Objects :");
	       employees.stream().sorted((s1,s2)->   //s1,s2 are objects
	       {
	    	   if(s1.getSalary()==s2.getSalary())
	    		   return 0;
	    	   else if (s1.getSalary()>s2.getSalary())
	                 return 1;
	    	   else
	    		   return -1;
	       
	       }).forEach(System.out::println);
	       
	      
		List<Employee> sp=  employees.stream().sorted((p1,p2)->  //p1,p2 are objects
	       {
	       	return p1.getName().compareTo(p2.getName());
	       }).collect(Collectors.toList()); 
	       sp.forEach(System.out::println);
	       
	       
	       employees.stream().sorted((p1,p2)->  //p1,p2 are objects
	       {
	       	return p1.getName().compareTo(p2.getName());
	       }).forEach(System.out::println);

		}

	}
