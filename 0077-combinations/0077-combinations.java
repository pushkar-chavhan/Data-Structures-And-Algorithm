class Solution {
    public void solve(int start ,int n,int k,ArrayList<Integer>ds,List<List<Integer>>result){
        if(k==0){
            result.add(new ArrayList<Integer>(ds));
            return;
        }
        if(start>n){
            return ;
        }
        // ds.add(start);
        // solve(start+1,n,k-1,ds,result);
        // ds.remove(ds.size()-1);
        // solve(start+1,n,k,ds,result);
        //OR:
        for(int i=start;i<=n;i++){
            ds.add(i);
            solve(i+1,n,k-1,ds,result);
            ds.remove(ds.size()-1);//backtrackk
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>>result=new ArrayList<>();
        ArrayList<Integer>ds=new ArrayList<>();
        solve(1,n,k,ds,result);
        return result;
    }
}