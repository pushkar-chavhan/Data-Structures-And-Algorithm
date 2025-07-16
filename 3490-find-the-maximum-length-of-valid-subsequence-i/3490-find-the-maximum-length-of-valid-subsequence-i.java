class Solution {
    public int maximumLength(int[] nums) {
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        int alternate=1;
        int parity=nums[0]%2;
        for(int i=1;i<nums.length;i++){
            int currParity=nums[i]%2;
            if(parity!=currParity){
                alternate++;
                parity=currParity;
            }
        }
        int max=Math.max(countEven,Math.max(countOdd,alternate));
        return max;
    }
}