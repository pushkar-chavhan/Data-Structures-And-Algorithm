class Solution {
    public boolean canPartition(int[] nums) {
        int total_sum=0;
        for(int num:nums){
            total_sum+=num;
        }
        if(total_sum%2!=0){
            return false;
        }
        int target=total_sum/2;
        boolean dp[]=new boolean[target+1];
        for(int num:nums){
            for(int j=target;j>=num;j--){
                dp[0]=true;
                dp[j]=dp[j]||dp[j-num];
            }
        }
        return dp[target];
    }
}