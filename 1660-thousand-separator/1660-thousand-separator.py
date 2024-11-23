class Solution:
    def thousandSeparator(self, n: int) -> str:
        s=str(n)
        reversed_s=s[::-1]
        chunks=[reversed_s[i:i+3] for i in range(0,len(reversed_s),3)]
        return '.'.join(chunks)[::-1]