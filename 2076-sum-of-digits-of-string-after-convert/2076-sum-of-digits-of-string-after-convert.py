class Solution:
    def getLucky(self, s: str, k: int) -> int:
        numeric_string=''.join(str(ord(ch)-ord('a')+1)for ch in s)
        for _ in range(k):
            numeric_string=str(sum(int(digit)for digit in numeric_string))

        return int(numeric_string)


