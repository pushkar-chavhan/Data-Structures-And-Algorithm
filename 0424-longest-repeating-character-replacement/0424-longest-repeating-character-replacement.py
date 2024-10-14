class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count = {}
        left = 0
        max_count = 0
        max_length = 0
        
        for right in range(len(s)):
            # Increment the count of the current character
            count[s[right]] = count.get(s[right], 0) + 1
            
            # Update the max_count to be the highest frequency character in the current window
            max_count = max(max_count, count[s[right]])
            
            # If the number of characters to replace exceeds k, shrink the window
            if (right - left + 1) - max_count > k:
                count[s[left]] -= 1
                left += 1
            
            # Update the maximum length of the valid window
            max_length = max(max_length, right - left + 1)
        
        return max_length
