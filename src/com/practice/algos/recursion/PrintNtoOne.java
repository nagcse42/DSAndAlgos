package com.practice.algos.recursion;


/**
 * This will print n to 1 number
 * Input: 5
 * Output: 5 4 3 2 1
 */
public class PrintNtoOne {

    public static void main(String[] args) {
        printNtoOne(5);
    }

    private static void printNtoOne(int n) {
        if(n == 0)
            return;
        else
            System.out.println(n);
            printNtoOne(n-1);
    }
}
