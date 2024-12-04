package com.qapitol.day4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public void createFile() throws IOException {
		File file = new File("abc.txt");
		file.createNewFile();
		
	}
	
	// IOException
	// SQLException
	// NullPointerException
	// ArrayIndexOutOfBoundExcepiton
	
	
	public static void main(String[] args) throws IllegalAgeException {
		
		Scanner sc = new Scanner(System.in);
		
		long age  = sc.nextLong();
		
		int intAge = (int) age;
		System.out.println(intAge);
		
		
//		if(age<18) {
//			
//			throw new IllegalAgeException("Illegal Age ");
//		}
//		System.out.println("Age"+age);
//		
//		sc.close();
//		int second = sc.nextInt();
//		
//		double result =0;
//		
//		try {
//			
//			result = first/second;
//			
//			System.out.println(result);
//			
//		}catch (Exception e) {
//			System.out.println("Please enter the correct Value");
//		}
//		
		

		

		

		
	}

}
