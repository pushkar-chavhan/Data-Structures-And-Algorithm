class Solution:
    def isPrefixString(self, s: str, words: List[str]) -> bool:
        prifix=""
        for w in words:
            prifix+=w
            if prifix==s:
                return True 
            elif len(prifix)>len(s):
                return False
        return False
