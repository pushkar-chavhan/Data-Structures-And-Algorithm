class Solution {
    public int subarraySum(int[] nums, int k) {
    //     BRUTE-FORCE
    //    int count=0;
    //    for(int i=0;i<nums.length;i++){
    //     int sum=0;
    //     for(int j=i;j<nums.length;j++){
    //         sum+=nums[j];
    //         if(sum==k){
    //             count++;
    //         }
    //     }
    //    }
    //    return count;



//OPTIMAL -USING PREFIX-SUM BY HASHMAP
    Map<Integer,Integer>mpp=new HashMap<>();
    int presum=0;
    int count=0;
    mpp.put(0,1);
    for(int i=0;i<nums.length;i++){
        presum+=nums[i];
        int remove=presum-k;
        if(mpp.containsKey(remove)){
            count+=mpp.get(remove);
        }
        mpp.put(presum,mpp.getOrDefault(presum,0)+1);
    }
    return count;
    }
}