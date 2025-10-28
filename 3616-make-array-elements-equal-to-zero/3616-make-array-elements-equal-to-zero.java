class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int curr=0;
        int sum=0;
        int result=0;
        for(int num:nums){
            sum+=num;
        }
        for(int i=0;i<n;i++){
            curr+=nums[i];
            int left=curr;
            int right=sum-curr;
            if(nums[i]!=0){
                continue;
            }
            if(left==right){
                result+=2;
            }
            else if(Math.abs(left-right)==1){
                result+=1;
            }
        }
        return result;
    }
}