package com.practice.blind75.arrays;

public class ProductOfArrayExpectSelf {
    public static void main(String[] args) {
       int[] input = new int[]{1,2,3,4};
       int[] prodArray = productExceptSelf(input);
    }

    public static int[] productExceptSelf(int[] nums) {
        int preFix=1, postFix=1;
        int[] outputArray=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            outputArray[i] = preFix;
            preFix=preFix*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--) {
            outputArray[i] = outputArray[i]*postFix;
            postFix=postFix*nums[i];

        }

        return outputArray;
    }
}
