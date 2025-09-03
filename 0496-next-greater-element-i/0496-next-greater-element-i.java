class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[]=new int[nums1.length];
        Map<Integer,Integer>nge=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
           int element=nums2[i];
            while(!st.isEmpty() && st.peek()<=element){
                st.pop();
            }
            nge.put(element,st.isEmpty() ? -1:st.peek());
            st.push(element);
        }
        for(int i=0;i<nums1.length;i++){
            result[i]=nge.get(nums1[i]);
        }
        return result;
    }
}