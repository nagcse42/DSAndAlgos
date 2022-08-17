package com.practice.blind75.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String input = "(){}";
        System.out.println(input+" is valid parentheses : "+isValidParentheses(input));
        input = "(){}[]";
        System.out.println(input+" is valid parentheses : "+isValidParentheses(input));
        input = "(){}[[]";
        System.out.println(input+" is valid parentheses : "+isValidParentheses(input));
        input = "]";
        System.out.println(input+" is valid parentheses : "+isValidParentheses(input));
    }

    private static boolean isValidParentheses(String inputString) {
        if(inputString.length() <= 1) {
            return false;
        }
        Stack<Character> parenthesesStack = new Stack<>();
        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');

        for (Character c : inputString.toCharArray()) {
            if (parenthesesMap.keySet().contains(c)) {
                parenthesesStack.push(c);
            } else if(!parenthesesStack.isEmpty()){
                Character startingChar = parenthesesStack.pop();
                Character closeBracket = parenthesesMap.get(startingChar);
                if(c != closeBracket) {
                    return false;
                }
            }
        }

        return parenthesesStack.isEmpty();
    }
}
