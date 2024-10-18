class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1:
            return "1"
    
        prev = "1"
    
        for _ in range(2, n+1):
            next_seq = ""
            count = 1
            for i in range(1, len(prev)):
                if prev[i] == prev[i-1]:
                    count += 1
                else:
                    next_seq += str(count) + prev[i-1]
                    count = 1
            next_seq += str(count) + prev[-1]
            prev = next_seq
        
        return prev