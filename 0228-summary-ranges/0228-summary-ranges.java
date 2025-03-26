class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String>result=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=nums[i];
            while(i+1<n&& nums[i+1]-nums[i]==1){
                i++;
            }
            if(start!=nums[i]){
                result.add(Integer.toString(start)+"->"+Integer.toString(nums[i]));
            }
            else{
                result.add(String.valueOf(start));
            }
        }
        return result;
    }
}