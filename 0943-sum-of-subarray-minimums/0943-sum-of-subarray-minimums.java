class Solution {
    private static int[] findNse(int[] arr){
        int []nse=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.empty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.empty() ? arr.length:st.peek();
            st.push(i);
        }
        return nse;
    }
    private static int[] findPse(int[] arr){
        int []pse=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.empty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            pse[i]=st.empty()?-1:st.peek();
            st.push(i);
        }
        return pse;
    }
    public int sumSubarrayMins(int[] arr) {
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     int min=arr[i];
        //     for(int j=i;j<arr.length;j++){
        //         min=Math.min(min,arr[j]);
        //         sum = (sum + min) % 1000000007;
        //     }
        // }
        // return sum;

        int nse[]=findNse(arr);
        int pse[]=findPse(arr);
        int total=0,mod=(int)(1e9+7);
        for(int i=0;i<arr.length;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            long contribution = (long) arr[i] * left * right;
            total = (int) ((total + contribution) % 1000000007);
        }
        return total;
    }
}