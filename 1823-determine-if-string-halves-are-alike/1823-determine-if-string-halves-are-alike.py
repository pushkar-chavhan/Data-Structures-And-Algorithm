class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        vowels="aeiouAEIOU"
        mid=len(s)//2
        # first_half=s[:mid]
        # second_half=s[mid:]
        # count1,count2=0,0
        # for i in first_half:
        #     if i in vowels:
        #         count1+=1
        # for j in second_half:
        #     if j in vowels:
        #         count2+=1
        # return count1==count2
        count=0
        for i in range(mid):
            if s[i] in vowels:
                count+=1
            if s[i+mid] in vowels:
                count-=1
        return count==0