package com.practice.algos.recursion;

/**
 * It checks given string palindrome or not
 * I/P: abba
 * O/P: true
 *
 * I/P: games
 * O/P: false
 */
public class Palindrome {

    public static void main(String[] args) {
        String str1 = "ABBA";
        System.out.println(str1+" is palindrome: "+isPalindrome(str1, 0, str1.length()-1));
        str1="Naga";
        System.out.println(str1+" is palindrome: "+isPalindrome(str1, 0, str1.length()-1));
        str1="DAAD";
        System.out.println(str1+" is palindrome: "+isPalindrome(str1, 0, str1.length()-1));
    }

    private static boolean isPalindrome(String str, int start, int end) {

        if(start >= end) {
            return true;
        }

        return  (str.charAt(start) == str.charAt(end) && isPalindrome(str, start+1, end-1));
    }
}
