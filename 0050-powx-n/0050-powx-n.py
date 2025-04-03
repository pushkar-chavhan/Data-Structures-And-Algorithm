class Solution:
    def myPow(self, x: float, n: int) -> float:
        def solve(x, n):
            if n == 0:
                return 1
            if n < 0:
                return solve(1 / x, -n)
            if n % 2 == 0:
                return solve(x * x, n // 2)
            else:  # n % 2 == 1
                return x * solve(x * x, (n - 1) // 2)
        
        return solve(x, n)
