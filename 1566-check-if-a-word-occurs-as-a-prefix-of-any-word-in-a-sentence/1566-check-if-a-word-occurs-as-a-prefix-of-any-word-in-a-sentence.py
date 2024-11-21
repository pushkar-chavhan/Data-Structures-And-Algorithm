class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        a=sentence.split()
        for i in a:
            if i.startswith(searchWord):
                return a.index(i)+1
            
        return -1