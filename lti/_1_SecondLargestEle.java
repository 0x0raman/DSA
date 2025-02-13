package lti;

public class _1_SecondLargestEle {
    public static int secondLar(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num < largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        System.out.println(secondLar(new int[] {1,2,2,3,4,4,4,3}));
    }
}
