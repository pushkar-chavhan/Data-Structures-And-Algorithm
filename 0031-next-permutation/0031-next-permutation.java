class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
       // Find the first decreasing element
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
         // Step 2: If we found such element, find the number just larger and swap them
        if(i>=0){
            int j=n-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
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