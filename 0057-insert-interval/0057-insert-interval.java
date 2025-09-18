class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();

        // 1️⃣  Add all intervals that end before newInterval starts
        //jr interval cha end chota ahe new Interval chya start peksha tr interval la add kr result mdhe
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // 2️⃣  Merge all overlapping intervals with newInterval
        //jr interval cha start chota asel newinterval chya end peksha t merge karach
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval); // add the merged interval

        // 3️⃣  Add the remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        // 4️⃣  Convert List<int[]> to int[][]
        return result.toArray(new int[result.size()][]);
    }
}
