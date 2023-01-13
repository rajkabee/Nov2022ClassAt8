package com.example.coreJava.collections;

public class MinMax {
	public static void main(String[] args) {
		int[] nums = {6,5,2,8,7};
		int min=nums[0], max=nums[0];
		int i, average, total=0;
		for(i=1; i<5; i++) {
			if(min>nums[i]) {
				min=nums[i];
			}
			if(max<nums[i]) {
				max=nums[i];
			}
		}
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		
		for(i=0; i<5; i++) {
			total+=nums[i];
		}
		average=total/5;
		System.out.println("Average: "+average);
	}
}
