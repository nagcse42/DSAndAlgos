package com.practice.algos.recursion;

/**
 * It will calculate factorial
 *  I/P: 4
 *  O/P: 24
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial of number : "+factorial(4));
    }

    private static int factorial(int number) {
        if(number ==0 || number == 1)
            return 1;
        return number * factorial(number-1);
    }
}
