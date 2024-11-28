from typing import List

class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        def count_freq(s):
            freq = {}
            for char in s:  # Fixed the variable name
                freq[char] = freq.get(char, 0) + 1
            return freq  # Moved return outside the loop

        char_count = count_freq(chars)
        total_length = 0

        for word in words:
            word_count = count_freq(word)
            if all(word_count[c] <= char_count.get(c, 0) for c in word_count):
                total_length += len(word)
    
        return total_length
