class Solution {
    public int minCost(String colors, int[] neededTime) {
         int n=neededTime.length;
        // int ans=0;
            char[]arr=colors.toCharArray();
        // for(int i=1;i<n;i++){
        //     if(arr[i]==(arr[i-1])){
        //         ans+=Math.min(neededTime[i],neededTime[i-1]);
        //     }
        // }
        // return ans;

        int time=0;
        int prev=0;
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]!=arr[i-1]){
                prev=0;
            }
            int curr=neededTime[i];
            time+=Math.min(prev,curr);
            prev=Math.max(prev,curr);
        }
        return time;
    }
}