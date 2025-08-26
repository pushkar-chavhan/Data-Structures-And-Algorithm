class Solution {
    int m,n;
    int dp[][];
    private int solve(String text1,String text2,int i,int j){
        if(i>=m || j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]=1+solve(text1,text2,i+1,j+1);
        }
        return dp[i][j]=Math.max(solve(text1,text2,i,j+1),solve(text1,text2,i+1,j));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        //Recursion + memoization
        m=text1.length();
        n=text2.length();
        dp=new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return  solve(text1,text2,0,0);

        //Bottum up
    //    int dp[][]=new int[text1.length()+1][text2.length()+1];
    //    for(int i=1;i<=text1.length();i++){
    //     for(int j=1;j<=text2.length();j++){
    //         if(text1.charAt(i-1)==text2.charAt(j-1)){
    //             dp[i][j]=1+dp[i-1][j-1];
    //         }
    //         else{
    //             dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
    //         }
    //     }
    //    } 
    //    return dp[text1.length()][text2.length()];
    }
}