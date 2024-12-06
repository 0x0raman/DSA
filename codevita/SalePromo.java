package codevita;

import java.util.*;

public class SalePromo {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int itemCount = inputScanner.nextInt();
        int[] productIds = new int[itemCount];
        int[] productPrices = new int[itemCount];
        for (int i = 0; i < itemCount; i++) {
            productIds[i] = inputScanner.nextInt();
        }
        for (int i = 0; i < itemCount; i++) {
            productPrices[i] = inputScanner.nextInt();
        }
        int availableBudget = inputScanner.nextInt();
        int[] result = calculateMaxFreebies(itemCount, productIds, productPrices, availableBudget);
        System.out.println(result[0] + " " + result[1]);
        inputScanner.close();
    }

    private static int[] calculateMaxFreebies(int itemCount, int[] productIds, int[] productPrices, int availableBudget) {
        int maxBonusItems = 0;
        int maxBonusValue = 0;
        for (int i = 0; i < itemCount; i++) {
            int currentPrice = productPrices[i];
            if (currentPrice > availableBudget) continue;
            int maxPurchaseQuantity = availableBudget / currentPrice;
            List<Integer> applicableFactors = new ArrayList<>();
            for (int j = 0; j < itemCount; j++) {
                if (i != j && productIds[i] % productIds[j] == 0) {
                    applicableFactors.add(j);
                }
            }
            int totalBonusItems = applicableFactors.size() * maxPurchaseQuantity;
            if (totalBonusItems > maxBonusItems) {
                maxBonusItems = totalBonusItems;
                maxBonusValue = 0;
                for (int factorIndex : applicableFactors) {
                    maxBonusValue += productPrices[factorIndex] * maxPurchaseQuantity;
                }
            } else if (totalBonusItems == maxBonusItems && totalBonusItems > 0) {
                int currentBonusValue = 0;
                for (int factorIndex : applicableFactors) {
                    currentBonusValue += productPrices[factorIndex] * maxPurchaseQuantity;
                }
                maxBonusValue = Math.max(maxBonusValue, currentBonusValue);
            }
        }

        return new int[]{maxBonusItems, maxBonusValue};
    }
}
