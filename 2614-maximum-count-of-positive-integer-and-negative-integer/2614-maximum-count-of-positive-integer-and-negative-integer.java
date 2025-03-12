class Solution {
    public int maximumCount(int[] nums) {
        int positive_count=0;
        int negative_count=0;
        int max_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negative_count++;
            }
            else if(nums[i]>0){
                positive_count++;
            }
            max_count=Math.max(negative_count,positive_count);
        }
        return max_count;
    }
}