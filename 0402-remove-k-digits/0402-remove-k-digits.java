import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < num.length(); i++) {
            char current = num.charAt(i);
            
            while (!st.isEmpty() && k > 0 && st.peek() > current) {
                st.pop();
                k--;
            }
            // Only push the current character if it's not a leading zero, or if the stack is not empty
            if (!st.isEmpty() || current != '0') {
                st.push(current);
            }
        }
        
        // If there are still characters to remove
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        
        // Build the result from the stack
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        result.reverse(); // Since we pop from the stack, the result is in reverse order
        
        // If the result is empty, return "0"
        if (result.length() == 0) {
            return "0";
        }
        
        return result.toString();
    }
}
