class Solution:
    def firstUniqChar(self, s: str) -> int:
        char_count={}
        for x in s:
            char_count[x]=char_count.get(x,0)+1
        for i,x in enumerate(s):
            if char_count[x]==1:
                return i
        return -1

