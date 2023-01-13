package com.example.coreJava.controlStatements.loops.nexted;

public class MultiplicationTables {
	public static void main(String[] args) {
		
		for(int n=2; n<=12; n++) {
			System.out.println("table for "+n);
			for(int i=1; i<=10; i++) {
				System.out.println(n+" x "+i+" = "+n*i);
			}
		}
	}
}
