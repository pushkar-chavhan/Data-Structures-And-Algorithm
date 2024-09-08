import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int row_begin = 0;
        int row_end = n - 1;
        int col_begin = 0;
        int col_end = m - 1;
        
        while (row_begin <= row_end && col_begin <= col_end) {
            
            // Traverse from left to right
            for (int j = col_begin; j <= col_end; j++) {
                result.add(matrix[row_begin][j]);
            }
            row_begin++;  // Move to the next row
            
            // Traverse downwards
            for (int j = row_begin; j <= row_end; j++) {
                result.add(matrix[j][col_end]);
            }
            col_end--;  // Move to the previous column
            
            // Traverse from right to left (only if we are still within valid rows)
            if (row_begin <= row_end) {
                for (int j = col_end; j >= col_begin; j--) {
                    result.add(matrix[row_end][j]);
                }
                row_end--;  // Move to the previous row
            }
            
            // Traverse upwards (only if we are still within valid columns)
            if (col_begin <= col_end) {
                for (int j = row_end; j >= row_begin; j--) {
                    result.add(matrix[j][col_begin]);
                }
                col_begin++;  // Move to the next column
            }
        }
        
        return result;  // Return the spiral order as a list
    }
}
