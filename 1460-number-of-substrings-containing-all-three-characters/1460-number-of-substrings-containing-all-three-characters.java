class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastseen = {-1, -1, -1};
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            lastseen[s.charAt(i) - 'a'] = i;
            if (lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != -1) {
                // Find the smallest index among the last occurrences of 'a', 'b', 'c'
                int minIndex = Math.min(Math.min(lastseen[0], lastseen[1]), lastseen[2]);
                // Count all substrings ending at index i that contain 'a', 'b', 'c'
                cnt += (minIndex + 1);
            }
        }
        return cnt;
    }
}
