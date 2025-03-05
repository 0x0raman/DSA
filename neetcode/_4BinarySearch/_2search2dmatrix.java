package neetcode._4BinarySearch;

@SuppressWarnings("unused")
public class _2search2dmatrix {
    private boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length, l = 0, r = rows * cols - 1;
        while(l <= r){
            int m = l + (r - l) / 2;
            int row = m / cols, col = m % cols;
            if(target > matrix[row][col]) l = m + 1;
            else if(target < matrix[row][col]) r = m - 1;
            else return true;
        }
        return false;
    }
}
//TC : O(log(m*n))
//SC: O(1)