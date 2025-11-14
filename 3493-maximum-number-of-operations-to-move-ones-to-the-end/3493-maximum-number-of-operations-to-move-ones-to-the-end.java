class Solution {
    public int maxOperations(String s) {
        int count1=0;
        int ans=0;
        int n=s.length();
        int i=0;
        while(i<n){
            if(s.charAt(i)=='0'){
                ans+=count1;
                while(i<n && s.charAt(i)=='0'){
                    i++;
                }
            }
            else{
                count1++;
                i++;
            }
        }
        return ans;
    }
}