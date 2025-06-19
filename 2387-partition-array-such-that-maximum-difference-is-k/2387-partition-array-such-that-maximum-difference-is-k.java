class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int min_val=nums[0];
        int subsequence=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-min_val>k){
                min_val=nums[i];
                subsequence++;
            }
        }
        return subsequence;
    }
}