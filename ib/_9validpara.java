package ib;

import java.util.Stack;

public class _9validpara {
    private static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c=='(') st.push(')');
            else if(c=='[') st.push(']');
            else if(c=='{') st.push('}');
            else if(st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[(])}";
        String expression3 = "{{[[(())]]}}";

        System.out.println("Expression 1: " + isValid(expression1)); // true
        System.out.println("Expression 2: " + isValid(expression2)); // false
        System.out.println("Expression 3: " + isValid(expression3)); // true
    }
}
