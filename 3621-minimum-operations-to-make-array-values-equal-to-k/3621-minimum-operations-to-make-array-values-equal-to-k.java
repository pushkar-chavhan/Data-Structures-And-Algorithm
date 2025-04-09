class Solution {
    public int minOperations(int[] nums, int k) {
       Set<Integer>temp=new HashSet<>();
       int answer=0;
       for(int i=0;i<nums.length;i++){
        temp.add(nums[i]);
       }
       for(int num:temp){
        if(num>k){
            answer++;
        }
        else if(num<k){
            return -1;
        }
       }
       return answer;
    }
}