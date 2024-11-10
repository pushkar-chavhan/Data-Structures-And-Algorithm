class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        uni_set=set(sentence)
        return len(uni_set)==26