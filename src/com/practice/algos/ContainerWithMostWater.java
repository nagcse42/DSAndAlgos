package com.practice.algos;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int waterContainers[] = {2,5,6,7,8,10};
		System.out.println("Max water area : " +getMaxWaterArea(waterContainers));
	}
	
	private static int getMaxWaterArea(int[] heightsOfContainers) {
		int max = Integer.MIN_VALUE;
		int i=0;
		int j= heightsOfContainers.length - 1;
		while(i < j) {
			int min = Math.min(heightsOfContainers[i], heightsOfContainers[j]);
			max = Math.max(max, min*(j-i));
			if(heightsOfContainers[i] < heightsOfContainers[j]) {
				i++;
			} else {
				j--;
			}
		}
		return max;
	}

}
