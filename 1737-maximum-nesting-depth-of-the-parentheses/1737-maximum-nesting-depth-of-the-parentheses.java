class Solution {
    public int maxDepth(String s) {
        int result=0;
        int openBracket=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                openBracket++;
                result=Math.max(result,openBracket);
            }
            else if(ch[i]==')'){
                openBracket--;
            }

        }
        return result;
    }
}