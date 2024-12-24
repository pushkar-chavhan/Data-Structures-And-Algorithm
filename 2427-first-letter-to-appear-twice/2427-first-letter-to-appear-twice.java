class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>seen=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(seen.contains(ch)){
                return ch;
            }
            else{
                seen.add(ch);
            }
        }
        return '\0';
    }
}