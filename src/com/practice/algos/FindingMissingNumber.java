package com.practice.algos;

import java.util.Arrays;

public class FindingMissingNumber {

	public static void main(String[] args) {
		int nums[]= {8,9,5,1,2,3,4,6};
		System.out.println("Missing number : "+getMissingNumber(nums));
	}

	private static int getMissingNumber(int nums[]) {
		Arrays.parallelSort(nums);
		int missingNum = -1;
		for(int i=0;i < nums.length;i++) {
		 if(i != nums.length-1) {
			 if(nums[i]+1 != nums[i+1]) {
				 missingNum = nums[i]+1;
				 break;
			 }
			}
		}
		return missingNum;
	}
}
