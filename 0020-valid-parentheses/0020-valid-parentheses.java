class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        // for(char ch:s.toCharArray()){
        //     if(ch=='('){
        //         stack.push(')');
        //     }
        //     else if(ch=='{'){
        //         stack.push('}');
        //     }
        //     else if(ch=='['){
        //         stack.push(']');
        //     }
        //     else if(stack.isEmpty() || stack.pop()!=ch){

        //         return false;
        //     }

        // }
        // return stack.isEmpty();
        for(char it:s.toCharArray()){
            if(it=='('||it=='['||it=='{'){
                st.push(it);
            }
            else{
                if(st.isEmpty()) return false;
                char ch=st.pop();
                if(it==')'&&ch=='('||
                it==']'&&ch=='['||
                it=='}'&&ch=='{')
                continue;
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}