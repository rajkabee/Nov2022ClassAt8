package com.example.coreJava.controlStatements.loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int b = sc.nextInt();
		System.out.println("Enter the power: ");
		int p = sc.nextInt();
		int res = 1;
		for(int i=0; i<p; i++) {
			res*=b;
		}
		System.out.println("Result: "+res);
	}
}
