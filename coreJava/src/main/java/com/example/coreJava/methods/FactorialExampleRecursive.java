package com.example.coreJava.methods;

import java.util.Scanner;

public class FactorialExampleRecursive {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int fact = factorial(num);
		System.out.println("Factorial of "+num+": "+fact);
	}

	private static int factorial(int num) {
		if(num==1)
		return 1;
		else
			return factorial(num-1)*num;
	}
}
