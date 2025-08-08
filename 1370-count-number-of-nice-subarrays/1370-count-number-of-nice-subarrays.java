class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countAtMost(nums, k) - countAtMost(nums, k - 1);
    }

    private int countAtMost(int[] nums, int k) {
        int left = 0, right = 0, count = 0, oddCount = 0;

        while (right < nums.length) {
            if (nums[right] % 2 != 0) oddCount++;

            while (oddCount > k) {
                if (nums[left] % 2 != 0) oddCount--;
                left++;
            }

            count += right - left + 1;
            right++;
        }

        return count;
    }
}
