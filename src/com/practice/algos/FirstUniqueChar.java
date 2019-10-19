package com.practice.algos;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

	public static void main(String[] args) {
		System.out.println("index uique character: " + getFirstUniqueChar("nagarjuna"));
	}
	
	private static int getFirstUniqueChar(String string) {
		int uniqueCharIndx = Integer.MAX_VALUE;
		if(string == null) {
			return uniqueCharIndx;
		} else {
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i=0; i<string.length(); i++) {
				if(map.containsKey(string.charAt(i))) {
					map.put(string.charAt(i),-1);
				} else {
					map.put(string.charAt(i),i);
				}
			}
			
			for(char c: map.keySet()) {
				if(map.get(c) != -1 && map.get(c) < uniqueCharIndx) {
					uniqueCharIndx = map.get(c);
				}
			}
		}
		
		
		return uniqueCharIndx;
	}

}
