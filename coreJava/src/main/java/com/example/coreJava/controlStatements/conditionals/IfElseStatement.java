package com.example.coreJava.controlStatements.conditionals;

import java.util.Scanner;

public class IfElseStatement {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		int age = new Scanner(System.in).nextInt();
		if(age<18) {
			System.out.println("You are a minor!");
			System.out.println("Go home!");
		}
		else if(age<60) {
			System.out.println("You are an adult!");
		}
		else {
			System.out.println("You age a senior citizen.");
		}
		
	}
}
