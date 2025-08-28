class Solution {
    // int dp[][]=new int[501][501];
    // int solve(String s,int i,int j){ 
    //     if(i>=j){
    //         return 0;
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     if(s.charAt(i)==s.charAt(j)){
    //         return dp[i][j]=solve(s,i+1,j-1);
    //     }
    //     else{
    //         return dp[i][j]= 1+Math.min(solve(s,i+1,j),solve(s,i,j-1));
    //     }
    // }
    public int minInsertions(String s) {
        int n=s.length();
        // for(int row[]:dp){
        //     Arrays.fill(row,-1);
        // }
        // return solve(s,0,n-1);

//Bottum-up 
        int dp[][]=new int[501][501];
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if(i>=j){
                    dp[i][j]= 0;
                }
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i+1][j],dp[i][j-1]);                }
            }

        }
        return dp[0][n-1];
    }
}