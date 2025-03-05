package neetcode._4BinarySearch;

import java.util.Arrays;

@SuppressWarnings("unused")
public class _3kokoEatingBananas {
    private int minEatingSpeed(int[] piles, int h) {
        int speed = 1;
        while(true){
            long totalTime = 0;
            for(int p : piles){
                totalTime += (int) Math.ceil((double) p / speed);
            }
            if(totalTime <= h){
                return speed;
            }
            speed++;
        }
    }
    //TC : O(m * n)
    //SC : O(1)
    private int minEatingSpeedOptimized(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt(), res = r;
        while(l <= r){
            int k = (l + r) / 2;
            int totalTime = 0;
            for(int p : piles){
                totalTime += Math.ceil((double) p / k);
            }
            if(totalTime <= h){
                res = k;
                r = k - 1;
            } else{
                l = k + 1;
            }
        }
        return res;
    }
}
//TC: O(n * logm)
//SC: O(1)