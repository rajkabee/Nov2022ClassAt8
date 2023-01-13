package com.example.coreJava.collections;

public class Ordering {
	public static void main(String[] args) {
		int[] num = { 5,4,3,2,1 };
		int i, j, t;
		for (i = 0; i < 4-i; i++) {
			for (j = 0; j < 4; j++) {
				if (num[j] > num[j + 1]) {
					t = num[j];
					num[j] = num[j + 1];
					num[j + 1] = t;
				}
				for (t = 0; t < 5; t++) {
					System.out.print(num[t] + "   ");
				}
				System.out.println();
			}
		}
		

	}
}
