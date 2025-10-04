class Solution {
     private boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count!=0)return false;
        }
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        List<String>result=new ArrayList<>();
        result.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!isAnagram(words[i],words[i-1])){
                result.add(words[i]);
            }
        }
        return result;
    }
}