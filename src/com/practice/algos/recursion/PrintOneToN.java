package com.practice.algos.recursion;

/**
 * It will print 1 to N
 * Input: 5
 * Output: 1 2 3 4 5
 */
public class PrintOneToN {

    public static void main(String[] args) {
        printOneToN(5);
    }

    private static void printOneToN(int n) {
        if(n == 0)
            return;
        else
            printOneToN(n-1);
            System.out.println(n);
    }
}

