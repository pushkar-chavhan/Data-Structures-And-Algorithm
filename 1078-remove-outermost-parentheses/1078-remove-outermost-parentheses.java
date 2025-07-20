class Solution {
    public String removeOuterParentheses(String s) {
        // StringBuilder ans=new StringBuilder();
        // char[]arr=s.toCharArray();
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     if(arr[i]=='('){
        //         count++;
        //         ans.append('(');
        //     }else
        //     if(count==0){
        //         i++;
        //     }
        //     else{
        //         ans.append(')');
        //         count--;
        //     }
        // }
        // return ans.toString();
        

        //using stack
        Stack<Character>st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!st.isEmpty()){
                    ans.append(ch);
                }
                st.push(ch);
            }
            else if(ch==')'){
                st.pop();
                if(!st.isEmpty()){
                    ans.append(ch);
                }
            }   
        }
        return ans.toString();
    }
}