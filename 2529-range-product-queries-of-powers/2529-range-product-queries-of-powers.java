class Solution {
    int M=(int)1e9+7;
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer>power=new ArrayList<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0){
                power.add(1<<i);//set bit 2^i;
            }
        }
        for(int q[]:queries){
            int start=q[0];
            int end=q[1];
            long product=1;
            for(int i=start;i<=end;i++){
                product=(product*power.get(i))%M;
            }
            result.add((int)product);
        }
        int []ans=new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}