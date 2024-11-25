class Solution:
    def reorderSpaces(self, text: str) -> str:
        words=text.split()
        total_space=text.count(" ")
        if len(words)==1:
            return words[0]+" "*total_space
        space_between=total_space//(len(words)-1)#spaces between the words
        space_end=total_space%(len(words)-1)#leftover space at  the end 
        return (" "*space_between).join(words)+" "*space_end

    

