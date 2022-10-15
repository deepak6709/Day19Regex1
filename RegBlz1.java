package com.RegexpBlz;

import java.util.regex.Pattern;

public class RegBlz1 {
	
	    public static boolean validFirstName(String name){
	// firstName or lastName starts with Cap and has minimum 3 characters

	        Pattern fName = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
	        boolean isValid = fName.matcher(name).matches();

	       return isValid;

	    }

	public static void main(String[] args) {
		if(validFirstName("deepak"))
		{
		System.out.println("Valid Name");
		}
		else {
			System.out.println("InValid Name");

		}
	}
		
	}


