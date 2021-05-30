package com.vm.java.training.strings;

public class ImmutableClass {
 private int id;
 private String name;
ImmutableClass(int id,String name){
	super();
	this.id=id;
	this.name=name;
}
public int getId() {
	return id;
}

public String getName() {
	return name;
}
	
}
