package com.example.coreJava.controlStatements.loops.nexted;

import java.util.Scanner;

public class Primes {
	public static void main(String[] args) {
		int range, flag, i;
		System.out.println("Enter the range: ");
		range = new Scanner(System.in).nextInt();
		for(int num = 0; num<=range; num++) {
			if(!(num==0||num==1)) {
				flag=0;
				for(i=2; i<num; i++) {
					if(num%i==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println(num);
				}
				
			}
		}
	}
}
