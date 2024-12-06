// package codevita;

// import java.util.*;

// public class BuzzDaySale {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] ids = new int[n];
//         int[] costs = new int[n];
//         for (int i = 0; i < n; i++) {
//             ids[i] = sc.nextInt();
//         }
//         for (int i = 0; i < n; i++) {
//             costs[i] = sc.nextInt();
//         }
//         int budget = sc.nextInt();
//         List<Integer>[] divisors = new List[1001];
//         for(int i = 1; i <= 1000; i++){
//             divisors[i] = new ArrayList<>();
//         }
//         for(int i = 1; i <= 1000; i++){
//             for(int j = i; j <= 1000; j += i){
//                 divisors[j].add(i);
//             }
//         }
//         Map<Integer, Integer> freeItemCount = new HashMap<>();
//         Map<Integer, Integer> freeItemWorth = new HashMap<>();
//         for(int i = 0; i < n; i++){
//             int itemId = ids[i];
//             for(int divisor : divisors[itemId]){
//                 for(int j = 0; j < n; j++){
//                     if(ids[j] == divisor && i != j){
//                         freeItemCount.put(itemId, freeItemCount.getOrDefault(itemId, 0) + 1);
//                         freeItemWorth.put(itemId, freeItemWorth.getOrDefault(itemId, 0) + costs[j]);
//                     }
//                 }
//             }
//         }
//         int maxFreeItems = 0;
//         int maxFreeWorth = 0;
//         for(int i = 0; i < n; i++){
//             int itemCost = costs[i];
//             int maxQuantity = budget / itemCost;
//             if(maxQuantity > 0){
//                 int freeItems = freeItemCount.getOrDefault(ids[i], 0) * maxQuantity;
//                 int freeWorth = freeItemWorth.getOrDefault(ids[i], 0) * maxQuantity;
//                 if(freeItems > maxFreeItems || (freeItems == maxFreeItems && freeWorth > maxFreeWorth)){
//                     maxFreeItems = freeItems;
//                     maxFreeWorth = freeWorth;
//                 }
//             }
//         }
//         System.out.print(maxFreeItems+" "+maxFreeWorth);
//         sc.close();
//     }
// }

// // import java.util.*;

// // public class BuzzDaySale {

// //     public static void main(String[] args) {
// //         Scanner scanner = new Scanner(System.in);

// //         // Input: Number of items
// //         int n = scanner.nextInt();

// //         // Input: Item IDs and costs
// //         int[] itemIds = new int[n];
// //         int[] itemCosts = new int[n];
// //         for (int i = 0; i < n; i++) {
// //             itemIds[i] = scanner.nextInt();
// //         }
// //         for (int i = 0; i < n; i++) {
// //             itemCosts[i] = scanner.nextInt();
// //         }

// //         // Input: Budget
// //         int budget = scanner.nextInt();

// //         // Map to store factors for each item ID
// //         Map<Integer, List<Integer>> factorsMap = new HashMap<>();
// //         for (int id : itemIds) {
// //             factorsMap.put(id, getFactors(id));
// //         }

// //         // Variables to track maximum free items and their worth
// //         int maxFreeItems = 0;
// //         int maxFreeWorth = 0;

// //         // Try purchasing each item
// //         for (int i = 0; i < n; i++) {
// //             int itemId = itemIds[i];
// //             int itemCost = itemCosts[i];

// //             // Calculate maximum quantity Veda can afford for this item
// //             int maxQuantity = budget / itemCost;

// //             // If Veda can't afford even one, skip this item
// //             if (maxQuantity == 0) continue;

// //             // Calculate free items and their total worth
// //             int freeItems = 0;
// //             int freeWorth = 0;
// //             for (int j = 0; j < n; j++) {
// //                 if (i != j && factorsMap.get(itemId).contains(itemIds[j])) {
// //                     freeItems += maxQuantity; // Free items are multiplied by maxQuantity
// //                     freeWorth += itemCosts[j] * maxQuantity;
// //                 }
// //             }

// //             // Update the maximums if the current combination is better
// //             if (freeItems > maxFreeItems || (freeItems == maxFreeItems && freeWorth > maxFreeWorth)) {
// //                 maxFreeItems = freeItems;
// //                 maxFreeWorth = freeWorth;
// //             }
// //         }

// //         // Output the result
// //         System.out.println(maxFreeItems + " " + maxFreeWorth);

// //         scanner.close();
// //     }

// //     // Helper function to get all factors of a number
// //     private static List<Integer> getFactors(int num) {
// //         List<Integer> factors = new ArrayList<>();
// //         for (int i = 1; i * i <= num; i++) {
// //             if (num % i == 0) {
// //                 factors.add(i);
// //                 if (i != num / i) { // Avoid adding square root twice
// //                     factors.add(num / i);
// //                 }
// //             }
// //         }
// //         return factors;
// //     }
// // }
