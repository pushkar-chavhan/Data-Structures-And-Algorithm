class Solution {
    
    // Helper function to generate all permutations of the array
    private void recurPermute(int[] nums, List<Integer> currentPermutation, List<List<Integer>> result, boolean[] used) {
        // Base case: if the current permutation is of the same size as the input array, add it to the result list
        if (currentPermutation.size() == nums.length) {
            // Create a copy of the currentPermutation list and add it to the result list
            result.add(new ArrayList<>(currentPermutation));
            return;
        }
        
        // Loop through all elements in the nums array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not used in the current permutation
            if (!used[i]) {
                // Mark the current element as used
                used[i] = true;
                // Add the current element to the currentPermutation list
                currentPermutation.add(nums[i]);
                
                // Recur to generate the remaining permutations
                recurPermute(nums, currentPermutation, result, used);
                
                // Backtrack by removing the last added element and marking it as unused
                currentPermutation.remove(currentPermutation.size() - 1);
                used[i] = false;
            }
        }
    }

    // Main function to return all permutations of the input array
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // To store all permutations
        List<Integer> currentPermutation = new ArrayList<>(); // Temporary list to store the current permutation
        boolean[] used = new boolean[nums.length]; // Boolean array to track which elements have been used in the current permutation
        
        // Call the helper function to generate all permutations
        recurPermute(nums, currentPermutation, result, used);
        
        return result; // Return the result list containing all permutations
    }
}
