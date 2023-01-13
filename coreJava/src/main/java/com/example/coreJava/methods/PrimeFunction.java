package com.example.coreJava.methods;

import java.util.Scanner;

public class PrimeFunction {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		if(num==1||num==0) {
			System.out.println("the number is neither a prime or a composite!");
		}
		else {
			boolean prim = prime(num);
			if(prim) {
				System.out.println(num+" is a Prime Number.");
			}
			else {
				System.out.println(num+" is not a Prime Number.");
			}
		}
	}

	private static boolean prime(int num) {
		boolean flag=true;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
