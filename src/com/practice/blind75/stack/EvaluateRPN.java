package com.practice.blind75.stack;

import java.util.Stack;
/****
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 * Note that division between two integers should truncate toward zero.
 *
 */

/**
 *
 */
public class EvaluateRPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            switch(tokens[i]) {
                case "+":
                    numbers.add(numbers.pop()+numbers.pop());
                    break;
                case "*":
                    numbers.add(numbers.pop()*numbers.pop());
                    break;
                case "-":
                    int a = numbers.pop();
                    int b = numbers.pop();
                    numbers.add(b-a);
                    break;
                case "/":
                    int c = numbers.pop();
                    int d = numbers.pop();
                    numbers.add(d/c);
                    break;
                default:
                    numbers.add(Integer.valueOf(tokens[i]));
            }
        }

        return numbers.pop();
    }

    public static void main(String[] args) {
        System.out.println("Expected 9: actual -> "+ evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println("Expected 6: actual -> "+ evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println("Expected 22: actual -> "+ evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

}
