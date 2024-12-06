package codevita;

import java.util.Scanner;
public class _1AlternatingBinaryString{
	public static void main(String[] args){
    //   Scanner sc = new Scanner(System.in);
    //   String binaryString = sc.nextLine();
    //   int n = binaryString.length();
    //   int[] worth = new int[n];
    //   for(int i = 0; i < n; i++){
    //     worth[i] = sc.nextInt();
    //   }
    //   char lastChar = ' ';
    //   int maxWorth = 0, removedWorth = 0;
    //   for(int i = 0; i < n; i++){
    //     if(binaryString.charAt(i) == lastChar){
    //       if(worth[i] > worth[i-1]){
    //         removedWorth += worth[i-1];
    //       } else {
    //         	removedWorth += worth[i];
    //         	continue;
    //       }
    //     }else { 
    //       maxWorth += worth[i];
    //     }
    //     lastChar = binaryString.charAt(i);
    //   }
    //   System.out.println(removedWorth);
    //   sc.close();
    // }
    Scanner sc = new Scanner(System.in);
    String binaryString = sc.nextLine();
    int n = binaryString.length();
    int[] worth = new int[n];
    for (int i = 0; i < n; i++) {
        worth[i] = sc.nextInt();
    }
    int removedWorth = 0;
    int lastIndex = -1;
    for (int i = 0; i < n; i++) {
        if (lastIndex != -1 && binaryString.charAt(i) == binaryString.charAt(lastIndex)) {
            if (worth[i] > worth[lastIndex]) {
                removedWorth += worth[lastIndex];
                lastIndex = i;
            } else {
                removedWorth += worth[i];
            }
        } else {
            lastIndex = i;
        }
    }
    System.out.println(removedWorth);
    sc.close();
  }
}