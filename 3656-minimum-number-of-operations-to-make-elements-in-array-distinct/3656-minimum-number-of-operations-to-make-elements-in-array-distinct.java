// class Solution {
//     private boolean isDistinct(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for (int i : nums) {
//             set.add(i);
//         }
//         return set.size() == nums.length;
//     }

//     public int minimumOperations(int[] nums) {
//         if (isDistinct(nums)) {
//             return 0;
//         }
//         if (nums.length <= 3) {
//             return 1;
//         }

//         int ans = 0;
//         // Just simulate taking groups of 3
//         for (int i = 0; i < nums.length; i += 3) {
//             int[] sub = Arrays.copyOfRange(nums, i, Math.min(i + 3, nums.length));
//             if (!isDistinct(sub)) {
//                 ans++;
//             }
//         }
//         return Math.max(ans, 1); // at least 1 operation
//     }
// }
class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!seen.add(nums[i])) {
                // Duplicate found at index i → remove up to i inclusive
                return (i / 3) + 1;
            }
        }
        return 0; // All distinct
    }
}
