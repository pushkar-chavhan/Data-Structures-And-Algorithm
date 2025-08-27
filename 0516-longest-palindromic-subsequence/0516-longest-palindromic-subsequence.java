class Solution {
    int dp[][];
    int solve(String s,int i,int j){
        if(i>j){
            return 0;
        }
        if(i==j){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=2+solve(s,i+1,j-1);
        }
        else{
            return dp[i][j]= Math.max(solve(s,i+1,j),solve(s,i,j-1));
        }
    }
    // int longestCommonSubsequence(String text1, String text2) {
    //     //We can solve this problem using LCS
    //     // Bottom-up DP  LCS
    //     int dp[][] = new int[text1.length() + 1][text2.length() + 1];
    //     for (int i = 1; i <= text1.length(); i++) {
    //         for (int j = 1; j <= text2.length(); j++) {
    //             if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
    //                 dp[i][j] = 1 + dp[i - 1][j - 1];
    //             } else {
    //                 dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
    //             }
    //         }
    //     }
    //     return dp[text1.length()][text2.length()];
    // }

    public int longestPalindromeSubseq(String s) {
        dp=new int [s.length()+1][s.length()+1];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return solve(s,0,s.length()-1);


        //using LCS|
        // String s1 = new StringBuilder(s).reverse().toString();
        // return longestCommonSubsequence(s, s1);
    }
}
