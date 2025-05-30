class Solution {
    public int minAddToMakeValid(String s) {
        int openCount = 0;    // Counts unmatched '('
        int closeNeeded = 0;  // Counts unmatched ')'

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;  // Increment unmatched '('
            } else if (c == ')') {
                if (openCount > 0) {  // Match ')' with '('
                    openCount--;
                } else {
                    closeNeeded++;  // No unmatched '(', so we need an extra ')'
                }
            }
        }

        // Total parentheses to add = unmatched '(' + unmatched ')'
        return openCount + closeNeeded;
    }
}
