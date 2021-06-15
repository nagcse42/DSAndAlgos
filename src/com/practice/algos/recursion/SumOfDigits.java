package com.practice.algos.recursion;

/**
 * It Calculates the sum of digits in number
 * I/P: 1234
 * O/P: 10 (1+2+3+4)
 */
public class SumOfDigits {
    static int sum = 0;
    public static void main(String[] args) {
        int number = 1234;
        System.out.print("Sum of "+number+" digits : "+sumOfDigits(number));
    }

    private static int sumOfDigits(int number) {
        if(number == 0)
            return 0;

        return sumOfDigits(number/10)+number%10;
    }
}
