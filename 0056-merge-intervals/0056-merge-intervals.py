from typing import List

class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if not intervals:
            return []

        # Sort intervals by the start time
        intervals.sort()
        result = []
        
        # Start with the first interval as the current newInterval
        newInterval = intervals[0]
        result.append(newInterval)
        
        for i in range(1, len(intervals)):
            currentStart, currentEnd = intervals[i]
            
            if currentStart <= newInterval[1]:  # Check for overlap
                # Merge intervals by updating the end of newInterval
                newInterval[1] = max(newInterval[1], currentEnd)
            else:
                # No overlap, add newInterval to result and start a new interval
                newInterval = intervals[i]
                result.append(newInterval)
        
        return result
