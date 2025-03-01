package neetcode._3Stack;

import java.util.Stack;

@SuppressWarnings("unused")
public class _2minStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    private _2minStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    private void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    private void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();
        if(top == minStack.peek()){
            minStack.pop();
        }
    }
    
    private int top() {
        return stack.peek();
    }
    
    private int getMin() {
        return minStack.peek();
    }
}
//TC: O(1) for all operations
//SC: O(n)