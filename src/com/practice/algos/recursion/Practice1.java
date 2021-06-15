package com.practice.algos.recursion;

public class Practice1 {
    public static void main(String[] args) {
        recursionNumber(4);
    }

    private static void recursionNumber(int number) {
        System.out.println(number);
        if(number == 0) {
            return;
        } else {
            recursionNumber(number-1);
            System.out.println(number);
        }
    }
}
