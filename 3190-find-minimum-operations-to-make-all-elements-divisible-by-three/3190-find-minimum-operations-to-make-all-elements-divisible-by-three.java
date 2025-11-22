class Solution {
    public int minimumOperations(int[] nums) {
        int res=0;
        int k=3;
        for(int num:nums){
            int remain=num%k;
            res+=Math.min(remain,k-remain);
        }
        return res;
    }
}