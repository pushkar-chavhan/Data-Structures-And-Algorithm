class Solution {
    //brute
    // public boolean isIncreasing(List<Integer>nums,int s,int e){
    //     for(int i=s+1;i<e;i++){
    //         if(nums.get(i-1)>=nums.get(i)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        // int n=nums.size();
        // for(int start=0;start+2*k<=n;start++){
        //     boolean first=isIncreasing(nums,start,start+k);
        //     boolean second=isIncreasing(nums,start+k,start+2*k);
        //     if(first &&second){
        //         return true;
        //     }
        // }
        // return false;



        //optimal
        int n=nums.size();
        int curr=1;
        int prev=0;
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)){
                curr+=1;
            }
            else{
                prev=curr;
                curr=1;
            }
            if(curr>=2*k){
                return true;
            }
            if(Math.min(curr,prev)>=k){
                return true;
            }
        }
        return false;
    }
}