package com.example.coreJava.variable;

import java.util.Scanner;

public class App {
	/*
	 
	 Variables in java
	 primitive types
	 	Integer
	 		byte 
	 			=>8bits
	 			min val: 1|1111111	=>negative|128
	 					: 0|0000000	=>positive|0
	 			max val: 0|1111111	=>positive|127
	 		short
	 			=>16bits
	 			=>-32768 to +32767
	 		int 
	 			=>32bits
	 			=>-2,147,483,648 to +2,147,483,647
	 		long
	 			=>64bits
	 			=>-9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
	 	Float
	 		float
	 		double
	 	Character
	 	
	 	Boolean
	 
	 */
	public static void main(String[] args) {
		byte b=123;
		short s= 32767;
		int i= 34214;
		long l= 31231l;
		
		float f= 1.234f;
		double d= 2.431;
		char ch='3';
		boolean bool = true;
		System.out.println("i = "+i);
		System.out.println(String.format("float f = %.3f", f));
		String name="kabiraj Shrestha";
		System.out.println(name);
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		name = sc.nextLine();
		System.out.println("Hello, "+name+"!");
		System.out.println("How old are you?");
		int age = sc.nextInt();
		//int age = Integer.parseInt(sc.next());
		System.out.println("so, you are "+age+"years old.");
	}
}
