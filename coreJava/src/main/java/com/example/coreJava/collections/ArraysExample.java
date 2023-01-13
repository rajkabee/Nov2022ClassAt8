package com.example.coreJava.collections;

public class ArraysExample {
	public static void main(String[] args) {
		int[] nums = {6,5,2,5,7};
		String[] names = new String[5];
		int[] count = new int[4];
		nums[0]=123;
		//nums= {3,4,5,6,7,8};
		//nums[5]=45;
		int a,b,c,d,e;
		for(int i=0; i<4; i++) {
			count[i]= i+2;
		}
		for(int i=0; i<4; i++) {
			System.out.println(count[i]);
		}
	}
}
