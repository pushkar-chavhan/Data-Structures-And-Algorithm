class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer,Integer>mp=new  HashMap<>();
        // for(int num:nums){
        //     mp.put(num,mp.getOrDefault(num,0)+1);
        // }
        // for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
        //     if(entry.getValue()==1){
        //         return entry.getKey();
        //     }
        // }
        // return -1;

        int a=0;
        for(int i=0;i<nums.length;i++){
            a=a^nums[i];
        }
        return a;
    }
}