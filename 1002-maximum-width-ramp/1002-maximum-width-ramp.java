// class Solution {
//     public int maxWidthRamp(int[] nums) {
//         int ramp=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]<=nums[j]){
//                     ramp=Math.max(ramp,j-i);
//                 }
//             }
//         }
//         return ramp;
//     }
// }
class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;

        // Create an array to store the maximum values from the right
        int[] maxRight = new int[n];
        maxRight[n - 1] = nums[n - 1];
        
        // Fill the maxRight array
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], nums[i]);
        }

        int ramp = 0;
        int i = 0;
        int j = 0;

        // Find the maximum width ramp
        while (j < n) {
            while (i < j && nums[i] > maxRight[j]) {
                i++;
            }
            ramp = Math.max(ramp, j - i);
            j++;
        }

        return ramp;
    }
}