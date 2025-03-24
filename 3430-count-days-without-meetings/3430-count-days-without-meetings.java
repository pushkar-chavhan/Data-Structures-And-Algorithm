class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,Comparator.comparingInt(a->a[0]));
        int end=0;
        int result=0;
        for(int []meet:meetings){
            if(meet[0]>end+1){
                result+=meet[0]-end-1;  
            }
            end=Math.max(end,meet[1]);
        }
        result+=(days-end);
        return result;
    }
}



// import java.util.Arrays;
// import java.util.Comparator;

// class Solution {
//     public int countDays(int days, int[][] meetings) {
//         Arrays.sort(meetings, Comparator.comparingInt(a -> a[0])); // Sort by start time
//         int end = 0;
//         int result = 0;
        
//         for (int[] meeting : meetings) {
//             if (meeting[0] > end + 1) {  // Check gap between meetings
//                 result += (meeting[0] - end - 1);
//             }
//             end = Math.max(end, meeting[1]);  // Update the last meeting day
//         }

//         result += (days - end);  // Add remaining days after last meeting
//         return result;
//     }
// }
