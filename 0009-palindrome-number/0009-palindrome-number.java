class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0) {
            return false;
        }

        // Step 2: Reverse the integer
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Step 3: Compare the original number with the reversed number
        return original == reversed;
    }
    
}