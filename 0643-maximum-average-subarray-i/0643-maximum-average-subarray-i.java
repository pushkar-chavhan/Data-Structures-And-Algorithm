class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        // Compute the sum of the first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        // Initialize maxSum with the sum of the first k elements
        int maxSum = sum;
        int startIndex = 0;
        int endIndex = k;

        // Slide the window over the array and compute new sums
        while (endIndex < nums.length) {
            sum -= nums[startIndex]; // Remove the element going out of the window
            sum += nums[endIndex]; // Add the new element coming into the window
            startIndex++;
            endIndex++;
            maxSum = Math.max(sum, maxSum); // Update maxSum if necessary
        }

        // Return the maximum average
        return (double) maxSum / k;
    }
}
