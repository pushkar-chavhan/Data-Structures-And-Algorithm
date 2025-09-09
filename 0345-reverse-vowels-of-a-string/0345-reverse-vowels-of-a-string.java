// import java.util.HashSet;
// import java.util.Set;

// public class Solution {
//     public String reverseVowels(String s) {
//         // Set of vowels for quick lookup
//         Set<Character> vowels = new HashSet<>();
//         vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
//         vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        
//         // Convert the string to a character array for easier manipulation
//         char[] sArray = s.toCharArray();
//         int left = 0, right = sArray.length - 1;
        
//         // Two-pointer approach
//         while (left < right) {
//             // Move the left pointer until we find a vowel
//             while (left < right && !vowels.contains(sArray[left])) {
//                 left++;
//             }
//             // Move the right pointer until we find a vowel
//             while (left < right && !vowels.contains(sArray[right])) {
//                 right--;
//             }
//             // Swap the vowels
//             char temp = sArray[left];
//             sArray[left] = sArray[right];
//             sArray[right] = temp;
            
//             // Move both pointers inward
//             left++;
//             right--;
//         }
        
//         // Convert the character array back to a string and return
//         return new String(sArray);
//     }

//     // public static void main(String[] args) {
//     //     Solution sol = new Solution();
        
//     //     String result1 = sol.reverseVowels("hello");
//     //     System.out.println(result1);  // Output: "holle"
        
//     //     String result2 = sol.reverseVowels("leetcode");
//     //     System.out.println(result2);  // Output: "leotcede"
//     // }
// }


//without charArray

class Solution {
    static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                    return true;
                }
                return false;
    }

    public String reverseVowels(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(!isVowel(s.charAt(i))){
                i++;
            }
            else if(!isVowel(s.charAt(j))){
                j--;
            }
            else{
                StringBuilder sb = new StringBuilder(s);
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
                s=sb.toString();
            }
        }
        return s;
    }
}