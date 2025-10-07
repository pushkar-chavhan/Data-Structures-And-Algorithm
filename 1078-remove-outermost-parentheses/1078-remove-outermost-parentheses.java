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

        //second approach
        // StringBuilder ans=new StringBuilder();
        // int count=0;
        // for(char ch:s.toCharArray()){
        //     if(ch==')'){
        //         count--;
        //     }
        //     if(count!=0){
        //         ans.append(ch);
        //     }
        //     if(ch=='('){
        //         count++;
        //     }
        // }
        // return ans.toString();

        //using stack
        //     Stack<Character>st=new Stack<>();
        //     StringBuilder ans=new StringBuilder();
        //     for(char ch:s.toCharArray()){
        //         if(ch=='('){
        //             if(!st.isEmpty()){
        //                 ans.append(ch);
        //             }
        //             st.push(ch);
        //         }
        //         else if(ch==')'){
        //             st.pop();
        //             if(!st.isEmpty()){
        //                 ans.append(ch);
        //             }
        //         }   
        //     }
        //     return ans.toString();

        //Striver method

        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {

                if (count > 0)
                    ans.append('(');
                count++;
            } else if (c == ')') {
                count--;
                if (count > 0)
                    ans.append(')');
            }
        }
        return ans.toString();
    }
}