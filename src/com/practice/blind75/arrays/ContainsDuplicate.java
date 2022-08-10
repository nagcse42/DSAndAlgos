package com.practice.blind75.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int unique[] = {1,2,3,5};
        System.out.println("Found duplicate : " +containsDuplicate(unique));
        int duplicateNums[] ={1,2,3,5,5,6};
        System.out.println("found duplicate : " +containsDuplicate(duplicateNums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        boolean foundDuplicate = false;
        for(int i=0;i<nums.length;i++) {
            if(numSet.contains(nums[i])) {
                foundDuplicate = true;
                break;
            } else {
                numSet.add(nums[i]);
            }
        }

        return foundDuplicate;
    }
}
