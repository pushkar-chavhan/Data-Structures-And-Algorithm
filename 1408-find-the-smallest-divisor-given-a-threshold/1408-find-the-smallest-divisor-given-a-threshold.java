class Solution {
    public static int sumBydiv(int nums[],int div){
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)(nums[i])/(double)(div));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi=Integer.MIN_VALUE;
        if(nums.length>threshold){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(nums[i],maxi);
        }

        int low=1;
        int high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            if(sumBydiv(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}