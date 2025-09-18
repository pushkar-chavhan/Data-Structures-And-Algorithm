class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        if(intervals.length<=1){
            return 0;
        }
        int count=1;
        int prev_interval=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=intervals[prev_interval][1]){
                prev_interval=i;
                count++;
            }
        }
        return intervals.length-count;
        
        // int result=0;
        // int prevEnd=intervals[0][1];
        // for(int i=1;i<intervals.length;i++){
        //     int start=intervals[i][0];
        //     int end=intervals[i][1];
        //     if(start>=prevEnd){
        //         prevEnd=end;
        //     }
        //     else{
        //         result++;
        //         prevEnd=Math.min(end,prevEnd);
        //     }
        // }
        // return result;

      
        
    }
}