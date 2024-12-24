class Solution:
    def repeatedCharacter(self, s: str) -> str:
        seen = set()  # Use a set to store characters we've seen so far
        for char in s:
            if char in seen:  # If the character is already in the set, it's repeated
                return char
            else:
                seen.add(char)  # Add the character to the set
        return ''  # This line is redundant for the problem but included for completeness
