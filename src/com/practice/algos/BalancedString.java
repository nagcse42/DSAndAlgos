package com.practice.algos;

/**
 * It will find the number of balanced string in given string
 *
 * Input: RLRRLLRLRL
 * Output: 4
 * Explanation: Input string can be split into RL RRLL RL RL
 *
 * Input: RLLLLRRRLR
 * Output: 3
 * Explanation: Input string can be split into RL LLLRRR LR
 */
public class BalancedString {
    public static void main(String[] args) {
        String string1 = "RLRRLLRLRL";
        System.out.println("Balance string count : "+getBalancedStringCount(string1));

        String string2 = "RLLLLRRRLR";
        System.out.println("Balance string count : "+getBalancedStringCount(string2));
    }

    private static int getBalancedStringCount(String input) {
        int balancedStringCount = 0;
        int balanceCount = 0;
        if(input == null || input.isEmpty()) {
            return balancedStringCount;
        } else {
            for (int index=0; index < input.length(); index++) {
                 char currentChar = input.charAt(index);
                 if(currentChar == 'L') {
                     balanceCount++;
                 } else if(currentChar == 'R') {
                     balanceCount--;
                 }

                 if(balanceCount == 0) {
                     balancedStringCount++;
                 }
            }
        }

        return balancedStringCount;
    }
}

