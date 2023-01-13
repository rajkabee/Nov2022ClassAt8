package com.example.coreJava.controlStatements.loops;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}
