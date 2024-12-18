from collections import Counter
from typing import List

class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        # Initialize the result with counts from the first word
        common_count = Counter(words[0])
        
        # Intersect with counts from each subsequent word
        for word in words[1:]:
            common_count &= Counter(word)
        
        # Expand the characters based on their counts
        result = []
        for char, count in common_count.items():
            result.extend([char] * count)
        
        return result
