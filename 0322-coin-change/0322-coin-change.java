class Solution {
    private int fun(int i, int T, int[] nums, int[][] dp) {
        if (i == 0) {
            if (T % nums[0] == 0)
                return T / nums[0];
            return 1000000000; // large value (acts as infinity)
        }
        if (dp[i][T] != -1)
            return dp[i][T];

        int notTake = fun(i - 1, T, nums, dp);
        int take = Integer.MAX_VALUE;
        if (nums[i] <= T) {
            take = 1 + fun(i, T - nums[i], nums, dp);
        }
        return dp[i][T] = Math.min(take, notTake);
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        // initialize dp with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = fun(n - 1, amount, coins, dp);
        if (ans >= 1000000000) {
            return -1;
        }
        return ans;
    }
}
