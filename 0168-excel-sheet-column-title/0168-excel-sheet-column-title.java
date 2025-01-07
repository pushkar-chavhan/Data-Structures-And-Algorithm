class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // Decrement columnNumber to handle 1-based indexing
            int remain = columnNumber % 26;
            result.append((char) ('A' + remain)); // Convert remainder to a character
            columnNumber /= 26;
        }
        
        return result.reverse().toString(); // Reverse the result and convert to string
    }
}
