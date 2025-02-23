package zeta;

public class CarPooling {
    private static boolean carPooling(int[][] trips, int capacity) {
        int[] lengthOfTrip = new int[1001];
        for(int  trip[] : trips){
            lengthOfTrip[trip[1]] += trip[0];
            lengthOfTrip[trip[2]] -= trip[0];
        }
        for(int i : lengthOfTrip){
            capacity -= i;
            if(capacity < 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        System.out.println(carPooling(trips, capacity));
    }
}
