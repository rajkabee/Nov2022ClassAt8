package com.example.coreJava.collections;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = {9,7,5,3,1};
		int i,j,k;
		for(i=0; i<4;i++) {
		for(j=i+1; j<5; j++) {
			if(num[i]>num[j]) {
				//swap
				num[i]+=num[j];
				num[j]=num[i]-num[j];
				num[i]-=num[j];
			}
			for(k=0; k<5; k++) {
				System.out.print(num[k]+"  ");
			}
			System.out.println();
		}
		}
		
	}
}
