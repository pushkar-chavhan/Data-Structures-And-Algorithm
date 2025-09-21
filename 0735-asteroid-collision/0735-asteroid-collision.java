// import java.util.Stack;

// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {
//         Stack<Integer> st = new Stack<>();
        
//         for (int i = 0; i < asteroids.length; i++) {
//             int asteroid = asteroids[i];
            
//             if (asteroid > 0) {
//                 st.push(asteroid); // Positive asteroids go to the stack
//             } else {
//                 // Check for collisions with positive asteroids
//                 while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroid)) {
//                     st.pop(); // Pop smaller positive asteroids
//                 }
                
//                 if (!st.isEmpty() && st.peek() == Math.abs(asteroid)) {
//                     st.pop(); // Both asteroids destroy each other
//                 } else if (st.isEmpty() || st.peek() < 0) {
//                     st.push(asteroid); // No collision or the current asteroid survives
//                 }
//             }
//         }
        
//         // Convert stack to array for return
//         int[] result = new int[st.size()];
//         for (int i = 0; i < result.length; i++) {
//             result[i] = st.get(i);
//         }
        
//         return result;
//     }
// }


class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int a :asteroids){
            while(!st.isEmpty() && a<0 && st.peek()>0){
                int sum=a+st.peek();
                if(sum<0){
                    st.pop();
                }
                else if(sum>0){
                    a=0;
                    break;
                }
                else{
                    st.pop();
                    a=0;
                }
            }
            if(a!=0){
                st.push(a);
            }
        }
        int size = st.size();
        int[] result = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}