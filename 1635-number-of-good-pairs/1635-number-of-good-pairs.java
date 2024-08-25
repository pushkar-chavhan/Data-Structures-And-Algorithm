class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count[]=new int[102];
        int goodPairs=0;
        for(int num:nums){
            goodPairs+=count[num];
            count[num]++;
        }
        return goodPairs;
    }
}