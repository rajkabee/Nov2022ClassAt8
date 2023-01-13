package com.example.coreJava.controlStatements.loops;

import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int a= x;
		int b= y;
		while(x%y!=0) {
			x=x%y;
			//swap
			x=x+y;
			y=x-y;
			x=x-y;
		}
		System.out.println("hcf: "+y);
		int lcm = (a*b)/y;
		System.out.println("lcm: "+lcm);
	}
}
