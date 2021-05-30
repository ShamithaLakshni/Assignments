package com.vm.java.training.newfeatures;
	interface Stringreverse{
		String reverse(String s);	
	}
	interface Stringlength{
		String length(String s);
		
	}
	

class LamdaAssignment{

		public static void main(String[] args) {


			Stringreverse  stringreverse =(s)->
		    {
		    	StringBuilder s1=new StringBuilder(s);
		    	s=s1.reverse().toString();
		    	
		    	return s+","+"length is "+s.length();
		    };
		    System.out.println("reverse of string is "+stringreverse.reverse("shamitha"));
		}

	}
	


