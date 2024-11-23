class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        vowels="aeiouAEIOU"
        mid=len(s)//2
        first_half=s[:mid]
        second_half=s[mid:]
        count1,count2=0,0
        for i in first_half:
            if i in vowels:
                count1+=1
        for j in second_half:
            if j in vowels:
                count2+=1
        return count1==count2