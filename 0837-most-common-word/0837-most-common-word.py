class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        normalized = ''.join([ch.lower() if ch.isalnum() else ' ' for ch in paragraph])
        words = normalized.split()
        
        # Create a set for banned words
        banned_set = set(banned)
        
        # Count frequencies of non-banned words
        word_count = {}
        for word in words:
            if word not in banned_set:
                word_count[word] = word_count.get(word, 0) + 1
        
        # Find the word with the maximum frequency
        most_common = max(word_count, key=word_count.get)
        return most_common