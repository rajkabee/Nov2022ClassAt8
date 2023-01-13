package com.example.coreJava.controlStatements.loops;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		System.out.println("Enter the range of fibonacci series: ");
		int r = new Scanner(System.in).nextInt();
		int n3;
		while(n1<=r) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		
		
				
	}
}
