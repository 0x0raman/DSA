package neetcode._3Stack;

import java.util.Stack;

@SuppressWarnings("unused")
public class _3evalRPN {
    private int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for(String c : tokens){
            if(c.equals("+")){
                stack.push(stack.pop() + stack.pop());
            } else if(c.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if(c.equals("*")){
                stack.push(stack.pop() * stack.pop());
            } else if(c.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}
//TC: O(n)
//SC: O(n)