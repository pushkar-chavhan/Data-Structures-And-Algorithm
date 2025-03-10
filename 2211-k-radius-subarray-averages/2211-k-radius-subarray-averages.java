class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        if(k==0){
            return nums;
        }
        int[]result=new int[n];
        Arrays.fill(result,-1);
        if(n<2*k+1){
            return result;
        }
        long []prefix_sum=new long[n];
        prefix_sum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix_sum[i]=prefix_sum[i-1]+nums[i];
        }
        for(int i=k;i<=n-k-1;i++){
            int left=i-k;
            int right=i+k;
            long sum=prefix_sum[right];
            if(left>0){
                sum-=prefix_sum[left-1];
            }
            result[i]=(int)(sum/(2*k+1));
        }
        return result;
    }
}