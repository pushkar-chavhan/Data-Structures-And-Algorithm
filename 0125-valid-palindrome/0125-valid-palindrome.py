class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.replace(" ","").lower()
        cleaned=''.join(i for i in s if i.isalnum())
        return cleaned==cleaned[::-1]