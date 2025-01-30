class Solution {
    public int[] leftRightDifference(int[] nums) {
       int n=nums.length;
       int rightSum[]=new int[n];
       int leftSum[]=new int[n];
       int result[]=new int[n];
       int lsum=0;
       for(int i=0;i<n;i++){
        leftSum[i]=lsum;
        lsum+=nums[i];
       }
       int rsum=0;
       for(int i=n-1;i>=0;i--){
        rightSum[i]=rsum;
        rsum+=nums[i];
       }
       for(int i=0;i<n;i++){
        result[i]=Math.abs(leftSum[i]-rightSum[i]);
       }
       return result;
    }
}