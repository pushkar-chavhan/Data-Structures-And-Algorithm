class Solution {

    //Simple check
      private boolean solve(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }


   //memoized method
    // int t[][];
 
    //  private boolean solve(String s, int l, int r) {
    //     if (l >= r) {
    //         return true;
    //     }

    //     if (t[l][r] != -1) {
    //         return t[l][r] == 1;
    //     }

    //     if (s.charAt(l) == s.charAt(r)) {
    //         t[l][r] = solve(s, l + 1, r - 1) ? 1 : 0;
    //     } else {
    //         t[l][r] = 0;
    //     }

    //     return t[l][r] == 1;
    // }
    public String longestPalindrome(String s) {
        // if (s.length() <= 1) {
        //     return s;
        // }

        // String LPS = s.substring(0, 1); // initialize with the first character

        // for (int i = 1; i < s.length(); i++) {
        //     // Odd length palindrome
        //     int low = i - 1;
        //     int high = i + 1;
        //     while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
        //         low--;
        //         high++;
        //     }
        //     String palindrome = s.substring(low + 1, high);
        //     if (palindrome.length() > LPS.length()) {
        //         LPS = palindrome;
        //     }

        //     // Even length palindrome
        //     low = i - 1;
        //     high = i;
        //     while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
        //         low--;
        //         high++;
        //     }
        //     palindrome = s.substring(low + 1, high);
        //     if (palindrome.length() > LPS.length()) {
        //         LPS = palindrome;
        //     }
        // }

        // return LPS;



        //Codestory with mik recursion+memoization

        int n=s.length();
        int maxlen=Integer.MIN_VALUE;
        int sp=0;
        // t=new int[n][n];
        // for(int row[]:t){
        //     Arrays.fill(row,-1);
        // }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s,i,j) && j-i+1>maxlen){
                    maxlen=j-i+1;
                    sp=i;
                }
            }
        }
        return s.substring(sp,sp+maxlen);
    }
}
