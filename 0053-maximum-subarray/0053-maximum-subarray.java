class Solution {
    public int maxSubArray(int[] nums) {
        // int sum=0;
        // int maxi=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     sum=sum+nums[i];
        //     maxi=Math.max(maxi,sum);
        //     if(sum<0){
        //         sum=0;
        //     }
        // }
        // return maxi;
        int maxSoFar=nums[0];
        int curr_max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr_max=Math.max(nums[i],nums[i]+curr_max);
            maxSoFar=Math.max(curr_max,maxSoFar);
        }
        return maxSoFar;
    }
}