import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int childIndex = 0;
        int cookieIndex = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        
        while (childIndex < g.length && cookieIndex < s.length) {
            if (s[cookieIndex] >= g[childIndex]) { 
                childIndex++;  // Move to the next child if current cookie satisfies this child
            }
            cookieIndex++;  // Move to the next cookie
        }
        
        return childIndex;  // childIndex now holds the count of satisfied children
    }
}
