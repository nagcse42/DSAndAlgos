package com.practice.algos;

import java.util.ArrayList;
import java.util.List;

public class LtrCmbntOfPhnNmbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Combinations : ");
		System.out.println(prepareCombinations("29"));
	}
	
	private static List<String> prepareCombinations(String digits){
		List<String> combinations = new ArrayList<String>();
		if(digits == null || digits.length() == 0) {
			return combinations;
		}
		
		String digitMapping[] = {"0","1","abc","def","ghi","jkl","mno","pqr","stu","wxyz"};
		mapDigitWithLetters(combinations, digits, "",0, digitMapping);
		return combinations;
		
	}
	
	private static void mapDigitWithLetters(List<String> combinations, String digits, String current, 
			int index,String digitMapping[]) {
		if(index == digits.length()) {
			combinations.add(current);
			return;
		}
		
		String letters = digitMapping[digits.charAt(index) - '0'];
		System.out.println("digit test: char at ->"+digits.charAt(index)+" after - : "+(digits.charAt(index) - '0'));
		for(int i=0;i<letters.length();i++) {
			
			mapDigitWithLetters(combinations,digits,current+letters.charAt(i),index+1, digitMapping);
		}
	}

}
