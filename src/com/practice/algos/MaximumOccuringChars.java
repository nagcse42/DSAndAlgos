package com.practice.algos;

/**
 * It will find max occured char in the string
 */
public class MaximumOccuringChars {
    static int ascii_vals= 256;
    public static void main(String[] args) {
        String word="Nagarjuna";
        System.out.println(getMaxOccuredChar(word));
    }
    private static char getMaxOccuredChar(String word) {
        char maxOccuredChar = ' ';
        int charOccurences[] = new int[ascii_vals];
        for(int i=0; i<word.length(); i++) {
            charOccurences[word.charAt(i)]++;
            System.out.println(word.charAt(i) + "-" +charOccurences[word.charAt(i)]);
        }

        int max = -1;
        for(int index=0; index < word.length(); index++) {
            if(max < charOccurences[word.charAt(index)]) {
                max = charOccurences[word.charAt(index)];
                maxOccuredChar = word.charAt(index);
            }
        }

        //printIntArray(charOccurences);

        return maxOccuredChar;
    }

    private static void printIntArray(int charOccurences[]) {
        for (int val: charOccurences) {
            System.out.println(val);
        }
    }
}
