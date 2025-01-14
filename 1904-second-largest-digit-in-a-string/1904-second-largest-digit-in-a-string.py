class Solution:
    def secondHighest(self, s: str) -> int:
        digits=[int(char) for char in s if char.isdigit()]
        unique_digit=list(set(digits))
        if len(unique_digit)<2:
            return -1
        unique_digit.sort(reverse=True)    
        return unique_digit[1]