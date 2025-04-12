class Solution {
    public int repeatedNTimes(int[] nums) {
        // int half_size=nums.length/2;

        // //Brute:
        // for(int i=0;i<nums.length;i++){
        //     int count=1;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //         if(count==half_size){
        //             return nums[i];
        //         }
        //     }
       
        // }
        // return -1;
        Set<Integer>seen=new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)) return num;
            seen.add(num);
        }
        return -1;
    }
}