class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
        String trimmed=doubled.substring(1,doubled.length()-1);
        return trimmed.contains(s);



        // int n = s.length();
        // // Check all possible substring lengths from 1 to n / 2
        // for (int i = 1; i <= n / 2; i++) {
        //     // Check if the length of `s` is divisible by `i`
        //     if (n % i == 0) {
        //         int times = n / i;
        //         String pattern = s.substring(0, i);
        //         StringBuilder newStr = new StringBuilder();
        //         // Build a string by repeating the pattern `times` times
        //         while (times-- > 0) {
        //             newStr.append(pattern);
        //         }
        //         // Check if the constructed string equals `s`
        //         if (newStr.toString().equals(s)) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}


