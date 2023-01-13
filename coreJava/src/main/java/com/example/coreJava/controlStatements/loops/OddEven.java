package com.example.coreJava.controlStatements.loops;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("Enter the range: ");
		int num = new Scanner(System.in).nextInt();
		System.out.println("All the odd numbers upto "+num+": ");
		for(int i=1; i<=num; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("All the even numbers upto "+num+": ");
		for(int i=2; i<=num; i+=2) {
			System.out.print(i+"\t");
		}
	}
}
