class Solution {
    public int maxDepth(String s) {
        int opencount=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                opencount++;
            }
            else if(ch==')'){
                opencount--;
            }
            ans=Math.max(ans,opencount);
        }
        return ans;
    }
}