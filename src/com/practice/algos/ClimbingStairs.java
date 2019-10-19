package com.practice.algos;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println("Number of ways to climb stairs: "+getNumberOfWaysToClimb(3));
	}

	private static int getNumberOfWaysToClimb(int n) {
		int stairs[] = new int[n+1];
		stairs[0]=1;
		stairs[1] = 1;
		for(int i=2;i<=n;i++) {
			stairs[i]=stairs[i-2]+stairs[i-1];
		}
		
		return stairs[n];
	}
}
