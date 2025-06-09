public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int total = 0;
        // Start by taking the first k cards
        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }

        int maxScore = total;

        // Slide the window: remove from the left and add from the right
        for (int i = 1; i <= k; i++) {
            total = total - cardPoints[k - i] + cardPoints[n - i];
            maxScore = Math.max(maxScore, total);
        }

        return maxScore;
    }
}
