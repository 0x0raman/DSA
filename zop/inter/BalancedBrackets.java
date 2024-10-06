package zop.inter;
import java.util.Stack;

public class BalancedBrackets {
    private static boolean areBracketsBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Check for closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty or top of stack doesn't match
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        
        // If stack is empty, all brackets are balanced
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[(])}";
        String expression3 = "{{[[(())]]}}";

        System.out.println("Expression 1: " + areBracketsBalanced(expression1)); // true
        System.out.println("Expression 2: " + areBracketsBalanced(expression2)); // false
        System.out.println("Expression 3: " + areBracketsBalanced(expression3)); // true
    }
}