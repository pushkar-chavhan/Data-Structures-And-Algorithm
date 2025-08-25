class Solution {
    int n;
    int dp[][];
    public int solve(int i,int []coins,int amount){
         
        if(amount==0){
            return 1;
        }
        if(i==n){
            return 0;
        }
        if(amount<coins[i]){
            return solve(i+1,coins,amount);
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int take=solve(i,coins,amount-coins[i]);
        int skip=solve(i+1,coins,amount);
        return dp[i][amount]= take+skip;
    }
    public int change(int amount, int[] coins) {
        n=coins.length;
        dp=new int[coins.length][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,coins,amount);
    }
}