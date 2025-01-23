class Solution {
    public boolean divideArray(int[] nums) {
        int cnt[]=new int[501];
        for(int num:nums){
            cnt[num]++;
        }
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]%2!=0){
                return false;
            }
        }
        return true;
    }
}