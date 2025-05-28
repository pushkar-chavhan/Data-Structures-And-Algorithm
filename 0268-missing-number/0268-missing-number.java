class Solution {
    public int missingNumber(int[] nums) {
    //     int n=nums.length;
    //   int  sum=0;
    //   int sum1=n*(n+1)/2;//Actual sum
    //     for(int i=0;i<n;i++){
    //         sum+=nums[i];//temp sum
    //     }
    //     return (sum1-sum);
        
        //XOR Method
        int xor1=0;
        int xor2=0;
        for(int i=0;i<nums.length;i++){
            xor2=xor2^nums[i];
            xor1=xor1^(i+1);
        }
        return (xor1^xor2);
    }
}