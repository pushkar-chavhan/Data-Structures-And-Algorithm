class Solution {
    public int myAtoi(String s) {

         int sign=1;
        int i=0;
        double ans=0;
        s=s.trim();
        if(s.isEmpty())return 0;
        if(s.charAt(i)=='+'||s.charAt(i)=='-'){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        while(i<s.length()&&Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            ans=ans*10+digit;
            if(sign==1&&ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign==-1&&ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(ans*sign);


        // another way to solve

        
        // if(s==null) return 0;

        // s=s.trim();
        
        // if(s.length()==0) return 0;
        
        // int sign = +1;
        // long ans = 0;
        // if(s.charAt(0) == '-') sign = -1;
        
        // int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
		
		// // initiate the starting pointer
        // int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
		
        // while(i < s.length()) {
        //     if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
        //     ans = ans * 10 + s.charAt(i)-'0';
        //     // check the conditions
        //     if(sign == -1 && -1*ans < MIN) return MIN;
        //     if(sign == 1 && ans > MAX) return MAX;
            
        //     i++;
        // }
        
        // return (int)(sign*ans);
    }
}