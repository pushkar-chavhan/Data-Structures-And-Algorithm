class Solution {
    private void findCombination(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        // Base condition: if the target is met, add the combination to the answer
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        // Iterate over the candidates array
        for (int i = ind; i < arr.length; i++) {
            // Skip duplicate elements to avoid repeating combinations
            if (i > ind && arr[i] == arr[i - 1]) continue;
            
            // If the element is greater than the remaining target, no need to continue
            if (arr[i] > target) break;
            
            // Add the current element to the current combination (ds)
            ds.add(arr[i]);
            
            // Recursive call: move to the next index and reduce the target
            findCombination(i + 1, arr, target - arr[i], ans, ds);
            
            // Remove the last added element (backtrack) to explore other combinations
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // Sort the candidates array to handle duplicates and to optimize breaking the loop when arr[i] > target
        Arrays.sort(candidates);
        
        // Start the recursive function with an empty current combination (ds)
        findCombination(0, candidates, target, ans, new ArrayList<>());
        
        return ans;
    }
}
