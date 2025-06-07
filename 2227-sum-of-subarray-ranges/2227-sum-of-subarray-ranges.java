class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int large=nums[i];
            int small=nums[i];
            for(int j=i+1;j<nums.length;j++){
                large=Math.max(large,nums[j]);
                small=Math.min(small,nums[j]);
                sum+=(large-small);
            }
            
        }
        return sum;
    }
}