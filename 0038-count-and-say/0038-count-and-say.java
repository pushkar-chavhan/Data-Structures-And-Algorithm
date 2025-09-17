public class Solution {
    public String countAndSay(int n) {
        // if (n == 1) return "1";
        
        // String prev = "1";
        
        // for (int i = 2; i <= n; i++) {
        //     StringBuilder nextSeq = new StringBuilder();
        //     int count = 1;
            
        //     for (int j = 1; j < prev.length(); j++) {
        //         if (prev.charAt(j) == prev.charAt(j - 1)) {
        //             count++;
        //         } else {
        //             nextSeq.append(count).append(prev.charAt(j - 1));
        //             count = 1;
        //         }
        //     }
            
        //     nextSeq.append(count).append(prev.charAt(prev.length() - 1));
        //     prev = nextSeq.toString();
        // }
        
        // return prev;



        //mik

        if(n==1){
            return "1";
        }
        String say=countAndSay(n-1);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<say.length();i++){
            int count=1;
            char ch=say.charAt(i);
            while(i<say.length()-1&& say.charAt(i)==say.charAt(i+1)){
                count++;
                i++;
            }
            result.append(count).append(ch);
        }
        return result.toString();
    }
}
