class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        
        // Initialize the first row
        for (int col = 1; col < n; col++) {
            grid[0][col] += grid[0][col - 1];
        }
        
        // Initialize the first column
        for (int row = 1; row < m; row++) {
            grid[row][0] += grid[row - 1][0];
        }
        
        // Compute the minimum path sum
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        
        return grid[m - 1][n - 1];
    }
}
