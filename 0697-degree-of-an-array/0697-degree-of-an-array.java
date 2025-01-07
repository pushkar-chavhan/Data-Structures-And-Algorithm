class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        HashMap<Integer, Integer> firstIndex = new HashMap<>();
        HashMap<Integer, Integer> lastIndex = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
            if(!firstIndex.containsKey(nums[i])){
                firstIndex.put(nums[i],i);
            }
            lastIndex.put(nums[i],i);
        }  
        int degree=0;
        for(int count:countMap.values()){
            degree=Math.max(degree,count);
        }
        int minlength=nums.length;
        for(int num:countMap.keySet()){
            if(countMap.get(num)==degree){
                int length=lastIndex.get(num)-firstIndex.get(num)+1;
                minlength=Math.min(minlength,length);
            }
        }
        return minlength;
    }
}