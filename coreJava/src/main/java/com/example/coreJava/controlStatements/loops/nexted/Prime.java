package com.example.coreJava.controlStatements.loops.nexted;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag;
		int num,i;
		char ch;
		do {
			System.out.println("Enter a number: ");
			num = sc.nextInt();
			flag=0;
			for(i=2; i<num; i++) {
				if(num%i==0) {
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Composite");
			}
			System.out.println("Do you want to repeat(y/n)?");
			ch = sc.next().charAt(0);
		}while(ch=='y');

		
	}
}
