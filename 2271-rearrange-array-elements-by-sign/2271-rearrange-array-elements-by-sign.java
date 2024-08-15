class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        int pi=0;
        int ni=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                result[pi]=nums[i];
                pi+=2;
            }else{
                result[ni]=nums[i];
                ni+=2;
            }
        }
        return result;
    }
}