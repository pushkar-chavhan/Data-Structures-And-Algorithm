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