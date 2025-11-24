class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>result=new ArrayList<>();
        int remain=0;
        for(int i=0;i<nums.length;i++){
            remain=(remain*2+nums[i])%5;
            result.add(remain==0);
        }
        return result;
    }
}