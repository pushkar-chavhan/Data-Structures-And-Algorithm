class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character>alp_set=new HashSet<>();
        for(int i='a';i<='z';i++){
            alp_set.add((char)i);
        }
        for(int i=0;i<sentence.length();i++){
            alp_set.remove(sentence.charAt(i));
            if(alp_set.isEmpty()){
                return true;
            }
        }
        return false;
    }
}