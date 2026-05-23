class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int price: prices){
           buy = Math.min(buy, price);
           profit = Math.max(profit, price-buy);
        }
        return profit;
    }
}