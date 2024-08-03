class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min_sofar=prices[0];
        for(int i=0;i<prices.length;i++){
            min_sofar=Math.min(min_sofar,prices[i]);
            int profit=prices[i]-min_sofar;
            max_profit=Math.max(max_profit,profit);
        }
        return max_profit;
    }
}