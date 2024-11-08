class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        double_s=s+s
        trimmed=double_s[1:-1]
        return s in trimmed