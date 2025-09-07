class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
        //     return nums[n/2];

        //Morees voting algo
        // int votes=1;
        // int majority=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(votes==0){
        //         votes++;
        //         majority=nums[i];
        //     }
        //     else if(nums[i]==majority){
        //         votes++;
        //     }
        //     else{
        //         votes--;
        //     }
        // }
        // return majority;


//Brute:
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==nums[i]){
        //             count++;
        //         }
        //     }
        //     if(count>n/2){
        //         return nums[i];
        //     }
        // }
        // return -1;

        //HashMap
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}