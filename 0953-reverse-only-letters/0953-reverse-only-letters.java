class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();  // Convert string to char array
        int left = 0, right = arr.length - 1; // Initialize pointers

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;  // Move left pointer if not a letter
            } else if (!Character.isLetter(arr[right])) {
                right--; // Move right pointer if not a letter
            } else {
                // Swap letters
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }

        return new String(arr);  // Convert char array back to string
    }
}
