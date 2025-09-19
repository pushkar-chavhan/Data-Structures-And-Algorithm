class Solution {
    List<String>result=new ArrayList<>();

    public void solve(String curr,int n,int open,int close){
        if(curr.length()==2*n){
            result.add(curr);
            return;
        }
        if(open<n){
            curr+='(';
            solve(curr,n,open+1,close);
            curr=curr.substring(0,curr.length()-1);
        }
        if(close<open){
            curr+=')';
            solve(curr,n,open,close+1);
            curr=curr.substring(0,curr.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        solve("",n,0,0);
        return result;
    }
}