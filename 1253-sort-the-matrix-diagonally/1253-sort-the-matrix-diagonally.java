import java.util.*;

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        Map<Integer, List<Integer>> mp = new HashMap<>();
        
        // Step 1: Group numbers by diagonals (i - j)
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mp.computeIfAbsent(i - j, k -> new ArrayList<>()).add(mat[i][j]);
            }
        }
        
        // Step 2: Sort each diagonal list in descending order
        // (so we can remove last element while filling back)
        for (List<Integer> list : mp.values()) {
            Collections.sort(list, Collections.reverseOrder());
        }
        
        // Step 3: Reconstruct matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = mp.get(i - j).remove(mp.get(i - j).size() - 1);
            }
        }
        
        return mat;
    }
}
