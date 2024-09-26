import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        
        // Initialize all values to -1 (assuming no greater element found)
        for (int i = 0; i < n; i++) {
            nge[i] = -1;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        // We traverse the array twice due to circular nature
        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            
            // Maintain decreasing stack, find next greater element
            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                nge[stack.pop()] = nums[index];
            }
            
            // Only push indices for first pass, not during the second traversal
            if (i < n) {
                stack.push(index);
            }
        }
        
        return nge;
    }
}
