class Solution {
    public int singleNumber(int[] nums) {
        //using bit manupulation
    //   int a=0;
    //   for(int i=0;i<nums.length;i++){
    //     a=a^nums[i];
    //   }
    //   return a;

    //using set
    Set<Integer>set=new HashSet<>();
    int i=0;
    int n=nums.length;
    int ans=0;
    while(i<n){
        if(!set.contains(nums[i])){
            set.add(nums[i]);
        }
        else{
            set.remove(nums[i]);
        }
        i++;
    }
    for(int val:set){
        ans=val;
    }
    return ans;
    }
}