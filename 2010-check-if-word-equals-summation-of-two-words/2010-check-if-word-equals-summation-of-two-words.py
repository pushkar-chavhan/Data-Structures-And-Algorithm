class Solution:
    def isSumEqual(self, firstWord: str, secondWord: str, targetWord: str) -> bool:
        def word_to_num(word):
            return int(''.join(str(ord(char)-ord('a') )for char in word))

        num1=word_to_num(firstWord)
        num2=word_to_num(secondWord)
        num3=word_to_num(targetWord)

        return num1+num2==num3