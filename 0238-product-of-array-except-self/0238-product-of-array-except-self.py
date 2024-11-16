from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        
        # Initialize arrays with default values
        left = [1] * n
        right = [1] * n
        ans = [0] * n
        
        # Fill the left product array
        for i in range(1, n):
            left[i] = left[i - 1] * nums[i - 1]
        
        # Fill the right product array
        for i in range(n - 2, -1, -1):
            right[i] = right[i + 1] * nums[i + 1]
        
        # Calculate the result using left and right products
        for i in range(n):
            ans[i] = left[i] * right[i]
        
        return ans
