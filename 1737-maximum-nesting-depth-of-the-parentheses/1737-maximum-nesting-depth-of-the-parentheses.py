class Solution:
    def maxDepth(self, s: str) -> int:
        result=0
        openbracket=0
        for char in s:
            if char=='(':
                openbracket +=1
                result=max(result,openbracket)
            elif char==')':
                openbracket -=1
        return result
        