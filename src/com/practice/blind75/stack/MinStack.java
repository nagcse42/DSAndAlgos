package com.practice.blind75.stack;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    private List<Integer> stack = new ArrayList<>();
    private List<Integer> minStack = new ArrayList<>();

    public MinStack() {
    }
    
    public void push(int val) {
        stack.add(val);
        if(minStack.isEmpty()) {
            minStack.add(val);
        } else {
            int minVal = val > minStack.get(minStack.size()-1) ? 
                minStack.get(minStack.size()-1) : val ;
            minStack.add(minVal);
        }
    }
    
    public void pop() {
        minStack.remove(minStack.size()-1);
        stack.remove(stack.size()-1);

    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
       return minStack.get(minStack.size()-1);
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("At this level actual min -3 : from minStack : "+minStack.getMin());
        minStack.pop();
        System.out.println("At this level actual min -2 : from minStack : "+minStack.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */