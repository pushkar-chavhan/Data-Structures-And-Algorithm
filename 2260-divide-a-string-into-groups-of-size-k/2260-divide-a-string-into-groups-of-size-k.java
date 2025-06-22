import java.util.*;

class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int end = Math.min(i + k, s.length());
            StringBuilder chunk = new StringBuilder(s.substring(i, end));
            
            // If this chunk is shorter than k, pad with fill
            while (chunk.length() < k) {
                chunk.append(fill);
            }

            result.add(chunk.toString());
            i += k;
        }

        return result.toArray(new String[0]);
    }
}
