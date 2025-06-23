import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Find the element with frequency 1
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no such element found (optional)
        return -1;  // Or throw an exception if appropriate
    }
}
