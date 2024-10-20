class Solution:
    def longestPrefix(self, s: str) -> str:
        n = len(s)
        lps = [0] * n  # Longest Prefix Suffix array
        j = 0  # Length of the previous longest prefix suffix
        
        # Building the LPS array
        for i in range(1, n):
            while j > 0 and s[i] != s[j]:
                j = lps[j - 1]
            
            if s[i] == s[j]:
                j += 1
            lps[i] = j
        
        # The length of the longest happy prefix
        length_of_prefix = lps[-1]
        return s[:length_of_prefix]

# Example usage
sol = Solution()
s = "ababab"
print(sol.longestPrefix(s))  # Output: "abab"
