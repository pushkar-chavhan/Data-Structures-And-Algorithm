class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max_count=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max_count=Math.max(max_count,count);
        }
        return max_count;
    }
}