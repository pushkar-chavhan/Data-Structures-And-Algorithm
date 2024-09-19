class Solution {
    private void findSubset(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList) {
        // Add the current subset (combination) to the result list
        ansList.add(new ArrayList<>(ds));
        
        // Iterate over the elements starting from the current index
        for (int i = ind; i < nums.length; i++) {
            // Skip duplicates to avoid generating duplicate subsets
            if (i > ind && nums[i] == nums[i - 1]) continue;
            
            // Include the current number in the subset
            ds.add(nums[i]);
            
            // Recursively generate further subsets from the next index
            findSubset(i + 1, nums, ds, ansList);
            
            // Backtrack to explore subsets without the current number
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // Sort the array to handle duplicates
        Arrays.sort(nums);
        
        // Result list to hold all subsets
        List<List<Integer>> ansList = new ArrayList<>();
        
        // Call the recursive function starting at index 0 with an empty subset
        findSubset(0, nums, new ArrayList<>(), ansList);
        
        return ansList;
    }
}
