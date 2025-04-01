class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            char start=words[i].charAt(0);
            char end=words[i].charAt(words[i].length()-1);
            if(isVowel(start)&&isVowel(end)){
                count++;
            }
        }
        return count;
    }
    private boolean isVowel(char c){
        return c=='a' ||c=='e'||c=='i'||c=='o'||c=='u';
    }
}