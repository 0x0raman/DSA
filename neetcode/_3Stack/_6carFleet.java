package neetcode._3Stack;

import java.util.Arrays;
import java.util.Stack;

@SuppressWarnings("unused")
public class _6carFleet {
    private int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        for(int[] p : pair){
            stack.push((double) (target - p[0]) / p[1]);
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)){
                stack.pop();
            }
        }
        return stack.size();
    }
}
//TC: O(nlogn)
//SC: O(n)