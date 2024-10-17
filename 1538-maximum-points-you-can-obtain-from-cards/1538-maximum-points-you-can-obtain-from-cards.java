public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;

        // Calculate the total sum of the array
        for (int point : cardPoints) {
            totalSum += point;
        }

        // If k is equal to the number of cards, return the total sum
        if (k == n) {
            return totalSum;
        }

        // Find the sum of the subarray of size n - k (which we want to minimize)
        int windowSize = n - k;
        int currentWindowSum = 0;

        // Calculate the sum of the initial window of size n - k
        for (int i = 0; i < windowSize; i++) {
            currentWindowSum += cardPoints[i];
        }

        int minWindowSum = currentWindowSum;

        // Slide the window across the array and update the minimum window sum
        for (int i = 1; i <= k; i++) {
            currentWindowSum = currentWindowSum - cardPoints[i - 1] + cardPoints[i + windowSize - 1];
            minWindowSum = Math.min(minWindowSum, currentWindowSum);
        }

        // The maximum score is the total sum minus the minimum window sum
        return totalSum - minWindowSum;
    }
}
