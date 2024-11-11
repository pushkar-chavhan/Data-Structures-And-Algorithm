class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        childIndex=0
        CookieIndex=0
        g.sort()
        s.sort()
        while childIndex<len(g) and CookieIndex<len(s):
            if s[CookieIndex]>=g[childIndex]:
                childIndex+=1
            CookieIndex+=1
        return childIndex
