class Solution:
    def findLengthOfShortestSubarray(self, arr: List[int]) -> int:
        n = len(arr)
    
    # Step 1: Find the longest non-decreasing prefix
        left = 0
        while left + 1 < n and arr[left] <= arr[left + 1]:
            left += 1
    
    # If the whole array is already non-decreasing
        if left == n - 1:
            return 0
    
    # Step 2: Find the longest non-decreasing suffix
        right = n - 1
        while right > 0 and arr[right - 1] <= arr[right]:
            right -= 1
    
    # Minimum removal will be to either remove the left segment or the right segment
        min_remove = min(n - left - 1, right)
    
    # Step 3: Try to find the minimum removal length by checking between left and right
        l, r = 0, right
        while l <= left and r < n:
            if arr[l] <= arr[r]:
                min_remove = min(min_remove, r - l - 1)
                l += 1
            else:
                r += 1
    
        return min_remove