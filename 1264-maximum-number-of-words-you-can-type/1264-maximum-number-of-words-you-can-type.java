class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[]words=text.split(" ");
        char[]chars=brokenLetters.toCharArray();
        int ans=0;
        for(int i=0;i<words.length;i++){
            boolean canType=true;
            for(char ch:chars){
                if(words[i].indexOf(ch)!=-1){
                    canType=false;
                    break;
                }
            }
            if(canType)ans++;
        }
        return ans;
    }
}