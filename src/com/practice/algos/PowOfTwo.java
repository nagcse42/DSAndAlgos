package com.practice.algos;

public class PowOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("is pow of 2: "+isNumPowOfTwo(1024));
	}
	
	private static boolean isNumPowOfTwo(int number) {
		int i = 1;
		
		while(i<number) {
			i*=2;
		}
		
		return i == number;
	}

}
