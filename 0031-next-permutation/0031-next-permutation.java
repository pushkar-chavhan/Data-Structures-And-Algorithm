class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-1;
        // Step 1: Find the first decreasing element from the right
        while(i>0&& nums[i]<=nums[i-1]){
            i--;
        }
        if(i!=0){
            int idx=i;
              // Step 2: Find the element just larger than nums[i-1]
            for(int j=n-1;j>=i;j--){
                if(nums[j]>nums[i-1]){
                    idx=j;
                    break;
                }
            }
            swap(nums,i-1,idx);
        }
        reverse(nums,i,n-1);
    }
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int nums[],int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}