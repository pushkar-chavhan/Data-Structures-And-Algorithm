class Solution:
    def shortestToChar(self, s: str, c: str) -> list[int]:
        n = len(s)
        result = [0] * n
        prev = float('-inf')  # Use negative infinity for the left-to-right pass

        # Left to right pass
        for i in range(n):
            if s[i] == c:
                prev = i
            result[i] = i - prev

        prev = float('inf')  # Use positive infinity for the right-to-left pass

        # Right to left pass
        for i in range(n - 1, -1, -1):
            if s[i] == c:
                prev = i
            result[i] = min(result[i], prev - i)

        return result
