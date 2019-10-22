package com.practice.algos;

import java.util.HashSet;
import java.util.Set;

public class JwelsAndStones {

	public static void main(String[] args) {
		System.out.println("Jwels count in stone : "+countOfJwelsInStones("abc","abbajAbBa"));
	}
	
	private static int countOfJwelsInStones(String jwels, String stones) {
		Set<Character> jwelsSet = new HashSet<Character>();
		int jwelsCount = 0;
		if(jwels == null || stones == null) {
			return jwelsCount;
		}
		
		for(Character jwel : jwels.toCharArray()) {
			jwelsSet.add(jwel);
		}
		
		for(Character stone : stones.toCharArray()) {
			if(jwelsSet.contains(stone)) {
				jwelsCount++;
			}
		}
		
		return jwelsCount;
	}

}
