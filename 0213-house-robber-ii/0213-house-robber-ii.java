class Solution {
    private int Robber1(int nums[]){
        if(nums.length<2){
            return nums[0];
        }
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);

        }
        return dp[nums.length-1];
    }
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int skipLast[]=new int[nums.length-1];
        int skipFirst[]=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            skipLast[i]=nums[i];
            skipFirst[i]=nums[i+1];
        }
        int lootSkipLast=Robber1(skipLast);
        int lootSkipFirst=Robber1(skipFirst);
        return Math.max(lootSkipLast,lootSkipFirst);
    }
}