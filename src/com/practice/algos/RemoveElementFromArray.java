package com.practice.algos;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		int nums[]= {1,1,3,4,1,1,1,1};
		int val = 1;
		System.out.println("After removing elemets length: "+removeElement(nums, val));
	}

	private static int removeElement(int nums[], int val) {
		int index=0;
		
		for(int i: nums) {
			if(i != val) {
				nums[index++] = i;
			}
		}
		
		return index;
	}
}
