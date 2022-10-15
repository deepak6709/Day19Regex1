package com.RegexpBlz;

import java.util.regex.Pattern;
//firstName or lastName starts with Cap and has minimum 3 characters

public class RegularExpBlz {
	
	public static boolean validLastName(String name) {
		
		Pattern Lname=Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
		
		boolean isValid=Lname.matcher(name).matches();
		
		return isValid;
				             
		
	}

	public static void main(String[] args) {
		
		boolean valid=validLastName("1");
		
		if(valid==true) {
			
			System.out.println("it is valid");
		}
		else {
			
			
			System.out.println("it is invalid");
		}
	

	}

}
