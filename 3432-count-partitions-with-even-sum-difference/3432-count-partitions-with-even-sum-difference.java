class Solution {
    public int countPartitions(int[] nums) {
        //best approach
    //   int sum=0;
    //   for(int i=0;i<nums.length;i++){
    //     sum+=nums[i];
    //   }
    //   if(sum%2==0){
    //     return nums.length-1;
    //   }
    //   return 0;


    //2-pass approach
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int leftsum=0;
        int rightsum=0;
        int result=0;
        for(int i=0;i<=nums.length-2;i++){
            leftsum+=nums[i];
            rightsum=sum-leftsum;
            if((leftsum-rightsum)%2==0){
                result++;
            }
        }
        return result;
    }
}