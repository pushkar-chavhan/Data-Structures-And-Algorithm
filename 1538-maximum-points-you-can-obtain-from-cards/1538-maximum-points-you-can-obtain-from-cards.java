public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        // int total = 0;
        // // Start by taking the first k cards
        // for (int i = 0; i < k; i++) {
        //     total += cardPoints[i];
        // }

        // int maxScore = total;

        // // Slide the window: remove from the left and add from the right
        // for (int i = 1; i <= k; i++) {
        //     total = total - cardPoints[k - i] + cardPoints[n - i];
        //     maxScore = Math.max(maxScore, total);
        // }

        // return maxScore;

        int lsum=0,rsum=0,maxsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];          
        }
         maxsum=lsum;
        int rindex=n-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum +=cardPoints[rindex];
            rindex=rindex-1;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}
