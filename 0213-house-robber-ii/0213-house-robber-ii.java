class Solution {
//Codestory with mik
    int t[];
    int solve(int[]nums,int i,int n){
        if(i>n){
            return 0;
        }
        if(t[i]!=-1){
            return t[i];
        }
        int take=nums[i]+solve(nums,i+2,n);
        int notake=solve(nums,i+1,n);
        return t[i]= Math.max(take,notake);
    }






    // private int Robber1(int nums[]){
    //     if(nums.length<2){
    //         return nums[0];
    //     }
    //     int dp[]=new int[nums.length];
    //     dp[0]=nums[0];
    //     dp[1]=Math.max(nums[0],nums[1]);
    //     for(int i=2;i<nums.length;i++){
    //         dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);

    //     }
    //     return dp[nums.length-1];
    // }
    public int rob(int[] nums) {
        //codestoryWMIK
            t=new int[1001];
            int n=nums.length;
            if(n==1){
                return nums[0];
            }
            if(n==2){
                return Math.max(nums[0],nums[1]);
            }
            Arrays.fill(t,-1);
            //take first 0th house
            int take1stHouse=solve(nums,0,n-2);
            Arrays.fill(t,-1);
            int take2ndHouse=solve(nums,1,n-1);
            return Math.max(take1stHouse,take2ndHouse);











        // if(nums.length<2){
        //     return nums[0];
        // }
        // int skipLast[]=new int[nums.length-1];
        // int skipFirst[]=new int[nums.length-1];
        // for(int i=0;i<nums.length-1;i++){
        //     skipLast[i]=nums[i];
        //     skipFirst[i]=nums[i+1];
        // }
        // int lootSkipLast=Robber1(skipLast);
        // int lootSkipFirst=Robber1(skipFirst);
        // return Math.max(lootSkipLast,lootSkipFirst);
    }
}