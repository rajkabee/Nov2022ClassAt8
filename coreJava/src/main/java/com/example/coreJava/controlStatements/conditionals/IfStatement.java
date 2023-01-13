package com.example.coreJava.controlStatements.conditionals;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		char ch;
		System.out.println("press y to pring 3: ");
		ch = new Scanner(System.in).next().charAt(0);
		
		System.out.println(1);
		System.out.println(2);
		if(ch=='y')
			System.out.println(3);
		System.out.println(4);
	}
}
