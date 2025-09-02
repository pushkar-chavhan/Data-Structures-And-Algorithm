class Solution {
    public String removeDuplicates(String s) {
        // Stack<Character>st=new Stack<>();
        // StringBuilder res=new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     if(st.isEmpty() || st.peek()!=s.charAt(i)){
        //         st.push(s.charAt(i));
        //     }
        //     else{
        //         st.pop();
        //     }
        // }
        // while(!st.isEmpty()){
        //     res.append(st.peek());
        //     st.pop();
        // }
        // return res.reverse().toString();

        //Using String
        
        String result="";
        
        for(char ch:s.toCharArray()){
            int n=result.length();
            if(n>0 && result.charAt(n-1)==ch){
                result=result.substring(0,n-1);
            }
            else{
                result+=ch;
            }
        }
        return result;
    }
}