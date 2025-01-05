class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String prifix="";
        for(int i=0;i<words.length;i++){
            prifix+=words[i];
           if (prifix.equals(s)) {
                return true;
            }
            if(prifix.length()>s.length()){
                return false;
            }
        }
        return false;
    }
}