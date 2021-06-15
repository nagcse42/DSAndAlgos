package com.practice.algos.recursion;

/**
 * It will print febonacci numbers
 * I/P: 3
 * O/P: 0 1 1
 */
public class FebonacciNumbers {
    static int num1=0, num2=1, num3=0;
    public static void main(String[] args) {
        int febNumber = 10;
        System.out.print(num1+" "+num2);
        febonacciNumbers(febNumber-2);
    }

    private static void febonacciNumbers(int number) {
        if(number > 0) {
            num3 = num1 + num2;
            num1=num2;
            num2=num3;
            System.out.print(" "+num3);
            febonacciNumbers(number-1);
        }
    }
}
