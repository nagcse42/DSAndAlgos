package com.practice.algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindingSingleNum {

	public static void main(String[] args) {
		int []nums = {1,1,2,3,4,3,5,5,4};
		System.out.println("Unique values : "+findSingleNum(nums));
	}

	private static List<Integer> findSingleNum(int[] nums) {
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		for(int i: nums) {
			if(numMap.get(i) == null) {
				numMap.put(i, 1);
			} else {
				numMap.put(i, -1);
			}
		}
		
		List<Integer> uniqList = new ArrayList<Integer>();
		for(int key : numMap.keySet()) {
			if(numMap.get(key) != -1) {
				uniqList.add(key);
			}
		}
		return uniqList;
	}
}
