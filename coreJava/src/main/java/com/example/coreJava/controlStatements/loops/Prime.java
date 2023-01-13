package com.example.coreJava.controlStatements.loops;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		int flag=0;
		if(n==0||n==1) {
			System.out.println("neither prime nor composite!");
		}
		else {
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					System.out.println("Composite!");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Prime");
			}
		}
	}
}
