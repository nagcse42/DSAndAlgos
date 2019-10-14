package com.practice.algos;

public class FbncUsngDnmcPrgmng {
	static int tempMem[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tempMem = new int[100];
		System.out.println(febonaciNum(100, tempMem));

	}

	private static int febonaciNum(int n, int memCache[]) {
		if(memCache[n-1] != 0) {
			return memCache[n-1];
		}
		int result = 0;
		if(n==1 || n==2) {
			memCache[n-1] = 1;
			result = 1;
		} else {
			result = febonaciNum(n-1, memCache) + febonaciNum(n-2, memCache);
			memCache[n-1] = result;
		}
		
		
		return result;
	}
}
