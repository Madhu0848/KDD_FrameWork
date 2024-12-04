package com.qapitol.day4;

public class IllegalAgeException extends Exception{
	
	public IllegalAgeException(String message) {
		super(message);
		System.out.println("Exception -- ");
	}

}
