class Solution {
    int t[];
    int solve(int[]nums,int i,int n){
        if(i>=n){
            return 0;
        }
        if(t[i]!=-1){
            return t[i];
        }
        int take=nums[i]+solve(nums,i+2,n);
        int notake=solve(nums,i+1,n);
        return t[i]= Math.max(take,notake);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        t=new int[101];
        Arrays.fill(t,-1);
        return solve(nums,0,n);



        // if(nums.length<2){
        //     return nums[0];
        // }
        // int dp[]=new int[nums.length];
        // dp[0]=nums[0];
        // dp[1]=Math.max(nums[0],nums[1]);
        // for(int i=2;i<nums.length;i++){
        //     dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        // }
        // return dp[nums.length-1];
    }
}