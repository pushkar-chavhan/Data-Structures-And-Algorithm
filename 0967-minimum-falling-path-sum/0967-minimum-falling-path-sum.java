class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];

        // Initialize the first row of dp with the first row of matrix
        for (int col = 0; col < n; col++) {
            dp[0][col] = matrix[0][col];
        }

        // Build the dp table
        for (int row = 1; row < m; row++) {
            for (int col = 0; col < n; col++) {
                int leftDiagonal = (col - 1 >= 0) ? dp[row - 1][col - 1] : Integer.MAX_VALUE;
                int up = dp[row - 1][col];
                int rightDiagonal = (col + 1 < n) ? dp[row - 1][col + 1] : Integer.MAX_VALUE;

                dp[row][col] = matrix[row][col] + Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }

        // Find the minimum value in the last row
        int result = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            result = Math.min(result, dp[m - 1][col]);
        }

        return result;
    }
}
