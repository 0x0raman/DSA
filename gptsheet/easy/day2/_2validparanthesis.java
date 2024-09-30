package gptsheet.easy.day2;

import java.util.Stack;

public class _2validparanthesis {
    public static void main(String[] args) {
        String s = "([[{{{)";
        System.out.println(isValid(s));
    }
    private static boolean isValid(String s){
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c=='(') st.push(')');
            else if(c=='[') st.push(']');
            else if(c=='{') st.push('}');
            else if(st.isEmpty() || st.pop() !=c) return false;
        }
        return st.isEmpty();
    }
}
