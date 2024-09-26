import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Result array to store the next greater elements for nums1
        int[] result = new int[nums1.length];
        
        // HashMap to store the next greater element for each element in nums2
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        // Traverse nums2 in reverse to find the next greater element
        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];
            
            // Maintain a monotonic decreasing stack
            while (!st.isEmpty() && st.peek() <= element) {
                st.pop();
            }
            
            // If stack is empty, no greater element, otherwise take the top
            map.put(element, st.isEmpty() ? -1 : st.peek());
            
            // Push current element onto the stack
            st.push(element);
        }
        
        // For each element in nums1, find the next greater element from the map
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }
}

