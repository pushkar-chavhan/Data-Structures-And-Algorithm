class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Brute without hashset
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<=i+k && j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}