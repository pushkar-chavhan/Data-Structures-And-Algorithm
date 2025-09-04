class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            if(num<k){
                return -1;
            }
            else if(num>k && set.add(num)){
                count++;
            }
        }
        // for(int num:nums){
        //     set.add(num);
        // }
        // for(int s:set){
        //     if(s>k){
        //         count++;
        //     }
        //     else if(s<k){
        //         return -1;
        //     }
        // }
        return count;
    }
}