package com.example.coreJava.methods;

import java.util.Scanner;

public class JavaMethods {
	
	public static void main(String[] args) {
		command();
		int a = getNumber();
		int b = getNumber();
		int res = add(a,b);
		System.out.println("Sum: "+res);
		difference(a,b);
	}
	
	private static int getNumber() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static void difference(int a, int b) {
		System.out.println("Difference: "+(a-b));	
	}

	public static int add(int x, int y) {
		return x+y;
	}
	static void command() {
		System.out.println("Enter two numbers: ");
	}
}
