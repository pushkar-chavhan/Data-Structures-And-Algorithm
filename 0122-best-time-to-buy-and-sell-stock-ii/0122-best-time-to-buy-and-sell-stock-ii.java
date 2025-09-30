import java.util.*;
//very easy
class Solution {
    int t[];
    int solve(int nums[],int i){
        if(i<=0){
            return 0;
        }
        if(t[i]!=-1){
            return t[i];
        }
        int profit=solve(nums,i-1);
        if(nums[i]>nums[i-1]){
            profit+=nums[i]-nums[i-1];
        }
        return t[i]= profit;
    }
    public int maxProfit(int[] nums) {
        int n=nums.length;
        t=new int[n+1];
        Arrays.fill(t,-1);
        return solve(nums,n-1);
        // int maxProfit=0;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]>nums[i-1]){
        //         maxProfit+=nums[i]-nums[i-1];
        //     }
        // }
        // return maxProfit;
    }
}