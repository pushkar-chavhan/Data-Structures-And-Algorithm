class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n<=0:
            return False
        if (n & (n-1))==0:#In python use bitwise  and==& instead of logical and=and
            return True
        return False