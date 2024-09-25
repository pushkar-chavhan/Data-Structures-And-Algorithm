// import java.util.Stack;

// class MinStack {
//     Stack<Integer> st;
//     int mini;

//     public MinStack() {
//         st = new Stack<>();
//         mini = Integer.MAX_VALUE;
//     }

//     public void push(int val) {
//         if (st.isEmpty()) {
//             mini = val;
//             st.push(val);
//         } else {
//             if (val >= mini) {
//                 st.push(val);
//             } else {
//                 st.push(2 * val - mini);  // Store the modified value
//                 mini = val;  // Update the minimum
//             }
//         }
//     }

//     public void pop() {
//         if (st.isEmpty()) {
//             return;
//         }
//         int x = st.pop();
//         if (x < mini) {
//             mini = 2 * mini - x;  // Restore the previous minimum
//         }
//     }

//     public int top() {
//         if (st.isEmpty()) {
//             return -1;  // Error case if stack is empty
//         }
//         int x = st.peek();
//         if (x < mini) {
//             return mini;  // Return the current minimum if modified value
//         } else {
//             return x;  // Return the normal value
//         }
//     }

//     public int getMin() {
//         return mini;  // Always return the current minimum
//     }
// }
import java.util.Stack;

class MinStack {
    Stack<Long> st;
    long mini;

    public MinStack() {
        st = new Stack<>();
        mini = Long.MAX_VALUE;  // Use long to avoid overflow issues
    }

    public void push(int val) {
        if (st.isEmpty()) {
            mini = val;
            st.push(0L);  // Store difference (val - mini), which is 0 for the first element
        } else {
            st.push((long)val - mini);  // Store the difference between the current value and mini
            if (val < mini) {
                mini = val;  // Update mini
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long diff = st.pop();
        if (diff < 0) {
            mini = mini - diff;  // Restore the previous minimum if diff < 0
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long diff = st.peek();
        if (diff < 0) {
            return (int) mini;  // If negative, return the current minimum
        } else {
            return (int)(mini + diff);  // Otherwise return the top value
        }
    }

    public int getMin() {
        return (int) mini;  // Return the minimum element
    }
}
