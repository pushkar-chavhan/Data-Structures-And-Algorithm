import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        // Set of vowels for quick lookup
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        
        // Convert the string to a character array for easier manipulation
        char[] sArray = s.toCharArray();
        int left = 0, right = sArray.length - 1;
        
        // Two-pointer approach
        while (left < right) {
            // Move the left pointer until we find a vowel
            while (left < right && !vowels.contains(sArray[left])) {
                left++;
            }
            // Move the right pointer until we find a vowel
            while (left < right && !vowels.contains(sArray[right])) {
                right--;
            }
            // Swap the vowels
            char temp = sArray[left];
            sArray[left] = sArray[right];
            sArray[right] = temp;
            
            // Move both pointers inward
            left++;
            right--;
        }
        
        // Convert the character array back to a string and return
        return new String(sArray);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String result1 = sol.reverseVowels("hello");
        System.out.println(result1);  // Output: "holle"
        
        String result2 = sol.reverseVowels("leetcode");
        System.out.println(result2);  // Output: "leotcede"
    }
}
