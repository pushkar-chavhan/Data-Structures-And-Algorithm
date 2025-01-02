class Solution {
    public int[] findErrorNums(int[] nums) {
       int dup=-1;
       int missing=-1;
       for(int i=0;i<nums.length;i++){
        if(nums[Math.abs(nums[i])-1]<0){
            dup=Math.abs(nums[i]);
        }
        else{
            nums[Math.abs(nums[i])-1]*=(-1);
        }
       }
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            missing=i+1;
            break;
        }
       }
       return new int[]{dup,missing};
    }
}