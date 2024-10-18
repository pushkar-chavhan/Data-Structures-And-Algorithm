public class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        String prev = "1";
        
        for (int i = 2; i <= n; i++) {
            StringBuilder nextSeq = new StringBuilder();
            int count = 1;
            
            for (int j = 1; j < prev.length(); j++) {
                if (prev.charAt(j) == prev.charAt(j - 1)) {
                    count++;
                } else {
                    nextSeq.append(count).append(prev.charAt(j - 1));
                    count = 1;
                }
            }
            
            nextSeq.append(count).append(prev.charAt(prev.length() - 1));
            prev = nextSeq.toString();
        }
        
        return prev;
    }
}
