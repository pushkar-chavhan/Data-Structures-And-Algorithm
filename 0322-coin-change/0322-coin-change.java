class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }

        int[] minCoinDP = new int[amount + 1];
        minCoinDP[0] = 0;

        for (int i = 1; i <= amount; i++) {
            minCoinDP[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin >= 0 && minCoinDP[i - coin] != Integer.MAX_VALUE) {
                    minCoinDP[i] = Math.min(minCoinDP[i], 1 + minCoinDP[i - coin]);
                }
            }
        }

        return minCoinDP[amount] == Integer.MAX_VALUE ? -1 : minCoinDP[amount];
    }
}
