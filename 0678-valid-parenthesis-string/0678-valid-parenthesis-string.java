class Solution {

    
   public boolean checkValidString(String s) {
        //Bottum up
        int n=s.length();
        boolean dp[][]=new boolean[n+1][n+1];
        dp[n][0]=true;
        for(int i=n-1;i>=0;i--){
            for(int open=0;open<n;open++){
                boolean isValid=false;
                if(s.charAt(i)=='*'){
                        isValid|=dp[i+1][open+1];
                        if(open>0){
                            isValid|=dp[i+1][open-1];
                        }
                        isValid|=dp[i+1][open];
                }
                else if(s.charAt(i)=='('){
                    isValid|=dp[i+1][open+1];
                }
                else if(open>0){
                    isValid|=dp[i+1][open-1];
                }
                dp[i][open]=isValid;
            }
            
        }
        return dp[0][0];

//Recursion + memoization:
//         int n = s.length();
//         int[][] t = new int[n][n];
//         for (int[] row: t) {
//             Arrays.fill(row, -1);
//         }
//         return isValidString(0, 0, s, t);
    }

    // private boolean isValidString(int idx, int open, String str, int[][] t) {
    //     if (idx == str.length()) {
    //         return (open == 0);
    //     }
    //     if (t[idx][open] != -1) {
    //         return t[idx][open] == 1;
    //     }
    //     boolean isValid = false;
    //     if (str.charAt(idx) == '*') {
    //         isValid |= isValidString(idx + 1, open + 1, str, t);
    //         if (open > 0) {
    //             isValid |= isValidString(idx + 1, open - 1, str, t);
    //         }
    //         isValid |= isValidString(idx + 1, open, str, t);
    //     } else {
    //         if (str.charAt(idx) == '(') {
    //             isValid = isValidString(idx + 1, open + 1, str, t);
    //         } else if (open > 0) {
    //             isValid = isValidString(idx + 1, open - 1, str, t);
    //         }
    //     }
    //     t[idx][open] = isValid ? 1 : 0;
    //     return isValid;
    // }
}