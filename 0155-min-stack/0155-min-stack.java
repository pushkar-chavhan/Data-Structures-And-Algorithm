import java.util.Stack;

class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;;

    public MinStack() {
        st = new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int val) {
       st.push(val);
       if(minStack.isEmpty()||val<=minStack.peek()){
        minStack.push(val);
       }
    }

    public void pop() {
        int poppedval=st.pop();
        if(poppedval==minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minStack.peek();  // Always return the current minimum
    }
}
// import java.util.Stack;

// class MinStack {
//     Stack<Long> st;
//     long mini;

//     public MinStack() {
//         st = new Stack<>();
//         mini = Long.MAX_VALUE;  // Use long to avoid overflow issues
//     }

//     public void push(int val) {
//         if (st.isEmpty()) {
//             mini = val;
//             st.push(0L);  // Store difference (val - mini), which is 0 for the first element
//         } else {
//             st.push((long)val - mini);  // Store the difference between the current value and mini
//             if (val < mini) {
//                 mini = val;  // Update mini
//             }
//         }
//     }

//     public void pop() {
//         if (st.isEmpty()) return;

//         long diff = st.pop();
//         if (diff < 0) {
//             mini = mini - diff;  // Restore the previous minimum if diff < 0
//         }
//     }

//     public int top() {
//         if (st.isEmpty()) return -1;

//         long diff = st.peek();
//         if (diff < 0) {
//             return (int) mini;  // If negative, return the current minimum
//         } else {
//             return (int)(mini + diff);  // Otherwise return the top value
//         }
//     }

//     public int getMin() {
//         return (int) mini;  // Return the minimum element
//     }
// }
