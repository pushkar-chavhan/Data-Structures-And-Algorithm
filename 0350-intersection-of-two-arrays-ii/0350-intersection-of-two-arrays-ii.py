class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        counts = {}
        result = []

    # Count occurrences in nums1
        for num in nums1:
            if num in counts:
                counts[num] += 1
            else:
                counts[num] = 1

    # Find intersections with nums2
        for num in nums2:
            if num in counts and counts[num] > 0:
                result.append(num)
                counts[num] -= 1

        return result