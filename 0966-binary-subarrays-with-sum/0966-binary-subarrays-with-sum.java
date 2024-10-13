import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);  // Base case: 1 way to have sum = 0
        int currentSum = 0;
        int count = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            // Check if there is a subarray with the sum equal to 'goal'
            if (prefixSumCount.containsKey(currentSum - goal)) {
                count += prefixSumCount.get(currentSum - goal);
            }
            
            // Update the prefix sum count
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}
