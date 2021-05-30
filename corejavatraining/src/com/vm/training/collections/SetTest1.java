package com.vm.training.collections;
import java.util.*;
class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
class EmployeeDetails extends Employee{
	String Phno;
	String city;
	public EmployeeDetails(int id, String name, String phno, String city) {
		super(id, name);
		Phno = phno;
		this.city = city;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [Phno=" + Phno + ", city=" + city + "]";
	}
	
}
public class SetTest1 {
	public static void main(String[] args)
	{
		
	ArrayList arrayList = new ArrayList();//First Method
	arrayList.add(new Employee(4756,"shamitha"));
	System.out.println(arrayList);
		
		ArrayList<EmployeeDetails> arraylist = new ArrayList<>();
		arraylist.add(new EmployeeDetails(4756, "shamitha","9182736161","vijayawada"));
		System.out.println(arraylist);
		
		Employee e1 = new Employee(30540,"shamitha");//constructor created and passing values through constructor
		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(e1);//adding passed values to array list
		System.out.println(arrayList);
		
	}

}