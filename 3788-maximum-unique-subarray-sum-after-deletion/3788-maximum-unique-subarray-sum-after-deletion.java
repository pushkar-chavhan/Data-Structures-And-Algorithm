import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        boolean allNegative = true;
        int maxValue = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n >= 0) {
                allNegative = false;
            }
            if (n > maxValue) {
                maxValue = n;
            }
        }

        if (allNegative) {
            return maxValue;
        }

        Set<Integer> unique = new HashSet<>();
        for (int n : nums) {
            if (n > 0) {
                unique.add(n);  // Only store positive unique numbers
            }
        }

        int sum = 0;
        for (int val : unique) {
            sum += val;
        }

        return sum;
    }
}


//Brute Force
        // int maxSum = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     Set<Integer>seen=new HashSet<>();
        //     int currSum=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(seen.contains(nums[j])){
        //             break;
        //         }
        //         seen.add(nums[j]);
        //         currSum+=nums[j];
        //         maxSum=Math.max(maxSum,currSum);
        //     }
        // }
        // return maxSum;
//     }
// }