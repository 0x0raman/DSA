// package codevita;

// import java.util.*;

// public class _3BuzzDaySale {

//     public static void main(String[] args) {
//         Scanner inputScanner = new Scanner(System.in);
//         int itemCount = inputScanner.nextInt();
//         int[] itemIds = new int[itemCount];
//         int[] itemCosts = new int[itemCount];
//         for (int i = 0; i < itemCount; i++) {
//             itemIds[i] = inputScanner.nextInt();
//         }
//         for (int i = 0; i < itemCount; i++) {
//             itemCosts[i] = inputScanner.nextInt();
//         }
//         int budgetLimit = inputScanner.nextInt();
//         List<Integer>[] itemDivisors = new List[1001];
//         for (int i = 1; i <= 1000; i++) {
//             itemDivisors[i] = new ArrayList<>();
//         }
//         for (int i = 1; i <= 1000; i++) {
//             for (int j = i; j <= 1000; j += i) {
//                 itemDivisors[j].add(i);
//             }
//         }
//         Map<Integer, Integer> itemCountForFreebies = new HashMap<>();
//         Map<Integer, Integer> itemValueForFreebies = new HashMap<>();
//         for (int i = 0; i < itemCount; i++) {
//             int currentItemId = itemIds[i];
//             for (int divisor : itemDivisors[currentItemId]) {
//                 for (int j = 0; j < itemCount; j++) {
//                     if (itemIds[j] == divisor && i != j) {
//                         itemCountForFreebies.put(currentItemId, itemCountForFreebies.getOrDefault(currentItemId, 0) + 1);
//                         itemValueForFreebies.put(currentItemId, itemValueForFreebies.getOrDefault(currentItemId, 0) + itemCosts[j]);
//                     }
//                 }
//             }
//         }
//         int maxFreeItems = 0;
//         int maxFreeValue = 0;
//         for (int i = 0; i < itemCount; i++) {
//             int itemPrice = itemCosts[i];
//             int maxAffordableQuantity = budgetLimit / itemPrice;
//             if (maxAffordableQuantity > 0) {
//                 int totalFreeItems = itemCountForFreebies.getOrDefault(itemIds[i], 0) * maxAffordableQuantity;
//                 int totalFreeValue = itemValueForFreebies.getOrDefault(itemIds[i], 0) * maxAffordableQuantity;
//                 if (totalFreeItems > maxFreeItems || (totalFreeItems == maxFreeItems && totalFreeValue > maxFreeValue)) {
//                     maxFreeItems = totalFreeItems;
//                     maxFreeValue = totalFreeValue;
//                 }
//             }
//         }
//         System.out.print(maxFreeItems + " " + maxFreeValue);
//         inputScanner.close();
//     }
// }