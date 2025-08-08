import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        // prefixSumCount.put(0, 1);  // Base case: 1 way to have sum = 0
        // int currentSum = 0;
        // int count = 0;
        
        // for (int num : nums) {
        //     currentSum += num;
            
        //     // Check if there is a subarray with the sum equal to 'goal'
        //     if (prefixSumCount.containsKey(currentSum - goal)) {
        //         count += prefixSumCount.get(currentSum - goal);
        //     }
            
        //     // Update the prefix sum count
        //     prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        // }
        
        // return count;

        return countAtMost(nums, goal) - countAtMost(nums, goal - 1);
    }
        private int countAtMost(int[] nums, int goal) {
        int left = 0, right = 0, count = 0, sum = 0;
        if (goal < 0) return 0;
        while (right < nums.length) {
            sum+=nums[right];

            while (sum > goal) {
                sum-=nums[left];
                left++;
            }

            count += right - left + 1;
            right++;
        }

        return count;
        
    }
}
