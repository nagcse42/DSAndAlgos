package com.practice.algos;

public class FbncUsngBtmUp {

	public static void main(String[] args) {
		System.out.println(bottomUpFbnc(6));
	}
	
	private static int bottomUpFbnc(int n) {
		int bottomUp[] = new int[n+1];
		if(n == 1 || n ==2) {
			return 1;
		} else {
			bottomUp[1] = 1;
			bottomUp[2] = 1;
			for(int i=3; i<=n+1;i++) {
				bottomUp[i] = bottomUpFbnc(n-1)+bottomUpFbnc(n-2);
			}
			
			return bottomUp[n];
		}
	}

}
