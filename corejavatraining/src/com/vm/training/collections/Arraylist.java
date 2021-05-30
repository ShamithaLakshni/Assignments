package com.vm.training.collections;
import java.util.ArrayList;

public class Arraylist {
 
    public static void main(String[] a){
         
        ArrayList al = new ArrayList<String>();
        //add elements to the ArrayList
        System.out.println();

        al.add(5746);
        al.add("shamitha");
        al.add("lakshmi");
        al.add("kanaparthi");
        System.out.println(al);
  
//get elements by index
System.out.println("Element at index 1: "+al.get(2));
System.out.println("Does list contains JAVA? "+al.contains("JAVA"));
//add elements at a specific index
 al.add(2,"shamithalakshmik");
System.out.println(al);
System.out.println("Is arraylist empty? "+al.isEmpty());
System.out.println("Index of PERL is "+al.indexOf("PERL"));
System.out.println("Size of the arraylist is: "+al.size());
}
}