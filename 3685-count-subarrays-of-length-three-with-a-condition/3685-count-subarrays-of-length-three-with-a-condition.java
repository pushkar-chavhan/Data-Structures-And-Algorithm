class Solution {
    public int countSubarrays(int[] nums) {
        int left = 0;
        int ans = 0;
        for (int right = 0; right < nums.length; right++) {
            int sum = 0;
            if (right - left + 1 == 3) {
                sum = nums[left] + nums[right];
                if (nums[left + 1] / 2 == sum) {
                    ans += 1;
                }
                left++;
            }
        }
        return ans;
    }
}