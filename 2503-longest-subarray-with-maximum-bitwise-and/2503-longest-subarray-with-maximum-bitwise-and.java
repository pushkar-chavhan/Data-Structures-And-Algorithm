class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal=0;
        int result=0;
        int streak=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxVal){
                maxVal=nums[i];
                result=0;
                streak=0;
            }
            if(maxVal==nums[i]){
                streak++;
            }
            else{
                streak=0;
            }
            result=Math.max(result,streak);
        }
        return result;
    }
}