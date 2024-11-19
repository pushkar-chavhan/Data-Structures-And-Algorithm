class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        first=set("qwertyuiopQWERTYUIOP")
        second=set("asdfghjklASDFGHJKL")
        third=set("zxcvbnmZXCVBNM")
        result=[]
        for i in words:
            a=set(i)
            if a <= first or a <= second or a <= third:
                result.append(i)
        return result