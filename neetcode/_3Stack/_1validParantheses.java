package neetcode._3Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

@SuppressWarnings("unused")
public class _1validParantheses {
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == map.get(c)){
                    stack.pop();
                } else {
                    return false;
                }
            } else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
//TC : O(n)
//SC: O(n)