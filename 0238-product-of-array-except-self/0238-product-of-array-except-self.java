class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

        //APP-1 =With division

        // int productWithoutZero=1;
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         count++;
        //     }else{
        //         productWithoutZero*=nums[i];
        //     }
        // }
        // int result[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         if(count>0){
        //             result[i]=0;
        //         }
        //         else{
        //             result[i]=productWithoutZero/nums[i];
        //         }
        //     }
        //     else{
        //         if(count>1){
        //             result[i]=0;
        //         }
        //         else{
        //             result[i]=productWithoutZero;
        //         }
        //     }
        // }
        // return result;


        //Approach 2:without division but use extra spaces
        
        int left[]=new int[n];
        left[0]=1;
        int right[]=new int[n];
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            result[i]=left[i]*right[i];
        }
        return result;
    }
}