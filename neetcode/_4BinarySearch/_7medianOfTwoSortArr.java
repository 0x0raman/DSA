package neetcode._4BinarySearch;

@SuppressWarnings("unused")
public class _7medianOfTwoSortArr {
    private double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = nums1, b = nums2;
        int total = a.length + b.length, half = (total + 1) / 2;
        if(b.length < a.length){
            int[] temp = a;
            a = b;
            b = temp;
        }
        int l = 0, r = a.length;
        while(l <= r){
            int m = (l + r) / 2, n = half - m;
            int aleft = m > 0 ? a[m - 1] : Integer.MIN_VALUE;
            int bleft = n > 0 ? b[n - 1] : Integer.MIN_VALUE;
            int aright = m < a.length ? a[m] : Integer.MAX_VALUE;
            int bright = n < b.length ? b[n] : Integer.MAX_VALUE;
            if(bleft <= aright && aleft <= bright){
                if(total % 2 != 0) return Math.max(aleft, bleft);
                return (Math.max(aleft, bleft) + Math.min(aright, bright)) / 2.0;
            } else if(aleft > bright) r = m - 1;
            else l = m + 1;
        }
        return -1;
    }
}
//TC : O(log(min(n1, n2)))
//SC : O(1)