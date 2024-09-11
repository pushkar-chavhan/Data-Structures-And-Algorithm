class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //check array is empty???
        if(nums==null || nums.length<3){
            return new ArrayList<>();
        }
        //Sort the Array
        Arrays.sort(nums);
        //Create a set to remove duplicetes in output
        HashSet<List<Integer>>result=new HashSet<>();
        //in this loop fixed one element and find other two
        for(int i=0;i<nums.length-2;i++)//i-->length-2 because we have to pick2 elements
        {
            //find other two elements by two sum approach
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                   int sum=nums[i]+nums[left]+nums[right];
                    if(sum==0){
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    //if sum is -ve just increment left
                    else if(sum<0){
                        left++;
                    }
                    else{
                        right--;
                    }
            }
        }
        return new ArrayList<>(result);
    }
}