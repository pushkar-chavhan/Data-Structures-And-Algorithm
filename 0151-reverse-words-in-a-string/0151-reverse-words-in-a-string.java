// class Solution {
//     public String reverseWords(String s) {
//         // String []strs=s.trim().split("\\s+");
//         // StringBuilder res=new StringBuilder();
//         // for(int i=strs.length-1;i>=0;i--){
//         //     res.append(strs[i]);
//         //     if(i!=0){
//         //         res.append(" ");
//         //     }
//         // }
//         // return res.toString();

//         //using two pointer
//         //reverse whole string
//         s = s.trim().replaceAll("\\s+", " ");

//         //Step 2: reverse the entire string using StringBuilder
//         StringBuilder sb = new StringBuilder(s);
//         reverse(sb, 0, sb.length() - 1);

//         // Step 3: reverse each word
//         int n = sb.length();
//         int l = 0;
//         for (int r = 0; r <= n; r++) {
//             if (r == n || sb.charAt(r) == ' ') {
//                 reverse(sb, l, r - 1);
//                 l = r + 1;
//             }
//         }

//         return sb.toString();
//     }
//      private void reverse(StringBuilder sb, int left, int right) {
//         while (left < right) {
//             char temp = sb.charAt(left);
//             sb.setCharAt(left, sb.charAt(right));
//             sb.setCharAt(right, temp);
//             left++;
//             right--;
//         }
//     }
// }




//best and easy
class Solution {
    public String reverseWords(String s) {
        // 1. Reverse the whole string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        
        int i = 0;
        int l = 0, r = 0;
        int n = s.length();
        char[] arr = s.toCharArray();
        
        while (i < n) {
            // Skip spaces
            while (i < n && arr[i] != ' ') {//i ko agar char dikha to r ko dega and i++ and r++
                arr[r++] = arr[i++];
            }

            // If we have a word between l and r, reverse it
            if (l < r) {
                reverse(arr, l, r - 1);
                if(r<n){
                    arr[r] = ' ';
                }
                r++;
                l = r;
            }
            
            i++;
        }

        // Trim extra space at the end
        String result = new String(arr, 0, r - 1);
        return result;
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
