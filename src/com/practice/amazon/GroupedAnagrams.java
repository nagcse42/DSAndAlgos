package com.practice.amazon;

import java.util.*;

public class GroupedAnagrams {
    public static void main(String[] args) {
        String[] anagrams = new String[]{"ate", "obb","tea", "bob", "bbo", "cat", "eat","tac", "atc"};
        System.out.print("Grouped anagrams: ");
        System.out.print(getGroupOfAnagrams(anagrams));
    }

    private static List<List<String>> getGroupOfAnagrams(String[] anagrams) {
        List<List<String>> anagramsList = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String anagram : anagrams) {
            char[] chars = anagram.toCharArray();
            Arrays.sort(chars);
            String sortedAnagram = new String(chars);
            if(!anagramMap.containsKey(sortedAnagram)) {
                anagramMap.put(sortedAnagram, new ArrayList<>());
            }

            anagramMap.get(sortedAnagram).add(anagram);
        }

        anagramsList.addAll(anagramMap.values());
        return anagramsList;
    }
}
