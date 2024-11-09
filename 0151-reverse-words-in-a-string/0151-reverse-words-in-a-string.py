class Solution:
    def reverseWords(self, s: str) -> str:
        p=s.strip().split()
        q=p[::-1]
        a=" ".join(q)
        return a
        