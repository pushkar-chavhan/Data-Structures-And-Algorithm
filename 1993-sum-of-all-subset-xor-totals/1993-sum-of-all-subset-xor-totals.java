class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int currentXor) {
        if (index == nums.length) {
            return currentXor;
        }
        // Include nums[index]
        int withElement = dfs(nums, index + 1, currentXor ^ nums[index]);
        // Exclude nums[index]
        int withoutElement = dfs(nums, index + 1, currentXor);
        return withElement + withoutElement;
    }
}
