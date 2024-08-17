class Solution {
    public String largestOddNumber(String num) {
        // Traverse the string from the last character to the first
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            // Check if the character is an odd digit
            if ((ch - '0') % 2 != 0) {// in java characters represented in thier ascii value
                // Return the substring from the beginning to the current character
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return an empty string
        return "";
    }
}
