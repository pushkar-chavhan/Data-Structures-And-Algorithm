class Solution {
    public int numberOfSubstrings(String s) {
        // int[] lastseen = {-1, -1, -1};
        // int cnt = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     lastseen[s.charAt(i) - 'a'] = i;
        //     if (lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != -1) {
        //         // Find the smallest index among the last occurrences of 'a', 'b', 'c'
        //         int minIndex = Math.min(Math.min(lastseen[0], lastseen[1]), lastseen[2]);
        //         // Count all substrings ending at index i that contain 'a', 'b', 'c'
        //         cnt += (minIndex + 1);
        //     }
        // }
        // return cnt;

        int map[]=new int[3];
        int n=s.length();
        int result  =0;
        int i=0,j=0;
        while(j<n){
            char ch=s.charAt(j);
            map[ch-'a']++;
            while(map[0]>0 && map[1]>0 && map[2]>0){
                result+=(n-j);
                map[s.charAt(i)-'a']--;
                i++;
            }
            j++;
        }
        return result;
    }
}
