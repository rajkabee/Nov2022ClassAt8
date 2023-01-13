package com.example.coreJava.controlStatements.conditionals;

import java.util.Scanner;

public class SwitchCaseStatements {
	public static void main(String[] args) {
		System.out.println("------Main Menu------");
		System.out.println("a. Cappuccino");
		System.out.println("b. Expresso");
		System.out.println("c. Americano");
		System.out.println("d. Cafe Latte");
		System.out.println("e. Hot Chocolate");
		System.out.println("Choice: ");
		char ch = new Scanner(System.in).next().charAt(0);
		switch(ch) {
		case 'a':
			System.out.println("Enjoy your Cappuccino!");
			break;
		case 'b':
			System.out.println("Your expresso is served!");
			break;
		case 'c':
			System.out.println("Americano is served!");
			break;
		case 'd':
			System.out.println("Cafe latte is served!");
			break;
		case 'e':
			System.out.println("Hot Chocolate is served!");
			break;
		default:
			System.out.println("invalid Choice!");
		}
		
		
	}
}
