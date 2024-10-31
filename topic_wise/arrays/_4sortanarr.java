package topic_wise.arrays;

public class _4sortanarr {
    private static void sortanarr(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int j : arr){
            System.out.print(j+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,21,1};
        sortanarr(arr);
    }
}
