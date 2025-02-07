import java.util.HashMap;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> freq1 = new HashMap<>();
        HashMap<String, Integer> freq2 = new HashMap<>();

        // Count occurrences in words1
        for (String word : words1) {
            freq1.put(word, freq1.getOrDefault(word, 0) + 1);
        }

        // Count occurrences in words2
        for (String word : words2) {
            freq2.put(word, freq2.getOrDefault(word, 0) + 1);
        }

        int count = 0;
        for (String word : freq1.keySet()) {
            if (freq1.get(word) == 1 && freq2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}
