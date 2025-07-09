class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
        //     return nums[n/2];

        //Morees voting algo
        int votes=1;
        int majority=nums[0];
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority=nums[i];
            }
            else if(nums[i]==majority){
                votes++;
            }
            else{
                votes--;
            }
        }
        return majority;
    }
}