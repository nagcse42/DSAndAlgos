package com.practice.algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

	public static void main(String[] args) {
		String paragraph = "naga partitala naga venky Naga VEnky naga";
		String bannedWords[]= {"partitala","naga"};
		System.out.println("Most common used word : "+mostCommonUsedWord(paragraph, bannedWords));

	}
	
	private static String mostCommonUsedWord(String paragraph, String bannedWords[]) {
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		String lowerCaseParagraph = paragraph.toLowerCase();
		for(String word : lowerCaseParagraph.split(" ")) {
			if(!Arrays.stream(bannedWords).anyMatch(word::equals)) {
				if(wordCount.get(word) == null)
					wordCount.put(word, 1);
				else 
					wordCount.put(word, wordCount.get(word)+1);
			}
		}
		
		String result="";
		for(String key : wordCount.keySet()) {
			if(result == "" || wordCount.get(key) > wordCount.get(result)) {
				result = key;
			}
		}
		
		return result;
	}

}
