class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character,Integer>mpp=new HashMap<>();
        // int left=0;
        // int right=0;
        // int len=0;
        // int n=s.length();
        // while(right<n){
        //     if(mpp.containsKey(s.charAt(right))){
        //         left=Math.max(mpp.get(s.charAt(right))+1,left);
        //     }
        //         mpp.put(s.charAt(right),right);
        //         len=Math.max(len,right-left+1);
        //         right++;
        //     }
        
        // return len;

        //using hashset
        Set<Character>charSet=new HashSet<>();
        int maxlen=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}