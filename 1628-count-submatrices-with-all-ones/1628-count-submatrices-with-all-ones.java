class Solution {

    /**
     * Helper function: Given a 1D array rowMask of 0s and 1s,
     * counts the number of subarrays that consist entirely of 1s.
     * 
     * Example:
     * rowMask = [1, 1, 0, 1]
     * Consecutive 1s counts → [1, (1+1), reset, 1]
     * Subarray count = 1 + 2 + 0 + 1 = 4
     */
    private int subarraycount1(int[] rowMask) {
        int consecutive = 0;   // track current consecutive 1s
        int subArcount = 0;    // total subarrays count
        for (int val : rowMask) {
            if (val == 0) {
                consecutive = 0;   // reset if 0 found
            } else {
                consecutive++;     // extend streak of 1s
            }
            subArcount += consecutive;  // add number of subarrays ending here
        }
        return subArcount;
    }

    /**
     * Main function: Count the number of submatrices filled with 1s.
     * 
     * Idea:
     * - For every pair of rows (topRow..bottomRow),
     *   build a "rowMask" that represents the AND of these rows.
     * - rowMask tells which columns are still all 1s in that vertical strip.
     * - Use subarraycount1(rowMask) to count submatrices contributed by this strip.
     */
    public int numSubmat(int[][] mat) {
        int row = mat.length;
        int cols = mat[0].length;
        int totalCount = 0;   // final answer

        // Fix the starting row of submatrix
        for (int topRow = 0; topRow < row; topRow++) {
            // Initialize rowMask with all 1s (neutral for AND)
            int[] rowMask = new int[cols];
            for (int i = 0; i < cols; i++) {
                rowMask[i] = 1;
            }

            // Extend submatrix downward by choosing bottomRow
            for (int bottomRow = topRow; bottomRow < row; bottomRow++) {
                // Update rowMask with AND operation for current bottomRow
                for (int col = 0; col < cols; col++) {
                    rowMask[col] = rowMask[col] & mat[bottomRow][col];
                }

                // Count valid subarrays of 1s → contributes to submatrices
                totalCount += subarraycount1(rowMask);
            }
        }

        return totalCount;
    }
}
