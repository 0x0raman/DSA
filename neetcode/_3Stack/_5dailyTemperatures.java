package neetcode._3Stack;

import java.util.Stack;

@SuppressWarnings("unused")
public class _5dailyTemperatures {
    private int[] dailyTemperatures(int[] temperatures){
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[0]){
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t, i});
        }
        return res;
    }
}
//TC: O(n)
//SC: O(n)