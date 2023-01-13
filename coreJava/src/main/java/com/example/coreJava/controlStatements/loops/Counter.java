package com.example.coreJava.controlStatements.loops;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}
}
