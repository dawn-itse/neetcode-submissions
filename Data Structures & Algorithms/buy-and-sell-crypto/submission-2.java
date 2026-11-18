class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currPrice = prices[i] - minPrice; 
                if (currPrice > maxPrice) {
                    maxPrice = currPrice;
                }
            }
        }
        return maxPrice;
    }
}
