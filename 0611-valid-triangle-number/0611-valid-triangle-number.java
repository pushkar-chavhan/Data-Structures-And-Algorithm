class Solution {
    public int triangleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        if(n<3){
            return ans;
        }
        Arrays.sort(nums);
        for(int i=2;i<n;i++){
            int left=0;
            int right=i-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    ans+=right-left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return ans;
    }
}