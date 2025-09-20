class Solution {
    public void solve(int n,String s,char  prev ,List<String>ans){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        solve(n,s+'1','1',ans);
        if(prev!='0'){
            solve(n,s+'0','0',ans);
        }
    }
    public List<String> validStrings(int n) {
        String s="";
        char prev='1';
        List<String> ans=new ArrayList<>();
        solve(n,s,prev,ans);
        return ans;
    }
}