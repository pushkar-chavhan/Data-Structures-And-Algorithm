class Solution {
    public int longestOnes(int[] nums, int k) {
        //BRUTE FORCE
        int maxlen=0;
        // for(int i=0;i<nums.length;i++){
        //     int zeros=0;
        //     for(int j=i;j<nums.length;j++){///CREATING ALL SUBARRAYS
        //         if(nums[j]==0){
        //             zeros++;
        //         }
        //         if(zeros<=k){
        //             maxlen=Math.max(maxlen,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxlen;
        //

        //optimal
        
        int left=0,right=0;
        int zeros=0;
        while(right<nums.length){
            if(nums[right]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[left]==0){
                    zeros--; 
                }
                  left++;
            }
            if(zeros<=k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }
}