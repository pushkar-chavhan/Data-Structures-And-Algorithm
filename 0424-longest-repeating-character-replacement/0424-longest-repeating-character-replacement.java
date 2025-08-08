class Solution {
    public int characterReplacement(String s, int k) {
        //BRUTE
        //REPLACE ALL CHARACTER HAVING LESS FREQ INSTED OF HAVING MORE FREQ
        //i.e. LEN-MAXFREQ
        // int maxlen=0;
        // for(int i=0;i<s.length();i++){
        //     int freq[]=new int[26];
        //     int maxfreq=0;
        //     for(int j=i;j<s.length();j++){
        //         freq[s.charAt(j)-'A']++;
        //         maxfreq=Math.max(maxfreq,freq[s.charAt(j)-'A']);
        //         int changes=j-i+1-maxfreq;
        //         if(changes<=k){
        //             maxlen=Math.max(maxlen,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxlen;

        int freq[]=new int[26];
        int left=0;
        int maxfreq=0;
        int maxwid=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
            int windowSize=right-left+1;
            if(windowSize-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowSize=right-left+1;
            maxwid=Math.max(maxwid,windowSize);
        }
        return maxwid;
    }
}