class Solution {
    public String reverseWords(String s) {
        // String []strs=s.trim().split("\\s+");
        // StringBuilder res=new StringBuilder();
        // for(int i=strs.length-1;i>=0;i--){
        //     res.append(strs[i]);
        //     if(i!=0){
        //         res.append(" ");
        //     }
        // }
        // return res.toString();

        //using two pointer
        //reverse whole string
 s = s.trim().replaceAll("\\s+", " ");

        // Step 2: reverse the entire string using StringBuilder
        StringBuilder sb = new StringBuilder(s);
        reverse(sb, 0, sb.length() - 1);

        // Step 3: reverse each word
        int n = sb.length();
        int l = 0;
        for (int r = 0; r <= n; r++) {
            if (r == n || sb.charAt(r) == ' ') {
                reverse(sb, l, r - 1);
                l = r + 1;
            }
        }

        return sb.toString();
    }
     private void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }
}