import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        // 1️⃣ Sort intervals by start time
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0]; // start with the first interval
        result.add(newInterval);          // ✅ add it immediately

        // 2️⃣ Merge or add
        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {   // overlapping
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;            // move to next non-overlapping
                result.add(newInterval);
            }
        }

        // 3️⃣ Convert list to array
        return result.toArray(new int[result.size()][]);
    }
}
