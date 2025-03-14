class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1, right = 0, ans = 0;

        // Find the maximum possible pile size
        for (int candy : candies) {
            right = Math.max(right, candy);
        }
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long count = 0;  // Use long to avoid overflow

            // Count how many children can receive mid candies
            for (int candy : candies) {
                count += candy / mid;
            }

            if (count >= k) { // If we can allocate at least k children
                ans = mid;
                left = mid + 1; // Try for a larger pile size
            } else {
                right = mid - 1; // Reduce the pile size
            }
        }
        
        return ans;
    }
}
