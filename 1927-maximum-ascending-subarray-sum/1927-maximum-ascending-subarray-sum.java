class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }
            else{
                maxsum=Math.max(maxsum,sum);
                sum=nums[i];
            }
        }
        return Math.max(maxsum,sum);
    }
}