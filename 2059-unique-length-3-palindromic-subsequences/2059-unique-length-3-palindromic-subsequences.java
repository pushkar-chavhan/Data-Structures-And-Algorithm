class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        HashSet<Character>uniq=new HashSet<>();
        for(char ch:s.toCharArray()){
            uniq.add(ch);
        }
        int result=0;
        for(char letter:uniq){
            int first_index=-1;
            int last_index=-1;
            for(int i=0;i<n;i++){
                if(s.charAt(i)==letter){
                    if(first_index==-1){
                        first_index=i;
                    }
                    last_index=i;
                }
            }
            Set<Character>set=new HashSet<>();//storing middle character
            for(int i=first_index+1;i<=last_index-1;i++){
                set.add(s.charAt(i));
            }
            result+=set.size();
        }
        return result;
    }
}