package com.vm.java.training.strings;

public class StringSplit {

    public static void main(String a[]){
     
        String str = "Lockdown is extended in india";
        String[] tokens = str.split(" ");
        for(String s:tokens){
            System.out.println(s);
        }
        str = "lockdown   is    extended    in   india   ";
        tokens = str.split("\\s+");
    }
}
	
