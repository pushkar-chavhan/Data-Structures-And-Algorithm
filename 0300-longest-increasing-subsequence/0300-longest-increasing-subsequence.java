class Solution {
    public int lengthOfLIS(int[] nums) {
        int T[]=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(T[j]+1>T[i]){
                        T[i]=T[j]+1;
                    }
                }
            }
        }
        int maxInd=0;
        for(int i=0;i<T.length;i++){
            if(T[i]>T[maxInd]){
                maxInd=i;
            }
         
        }
           return T[maxInd]+1;
    }
}