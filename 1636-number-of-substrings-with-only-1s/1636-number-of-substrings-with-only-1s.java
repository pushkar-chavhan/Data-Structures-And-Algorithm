class Solution {
    double M=1e9+7;
    public int numSub(String s) {
       int result=0;
       int count=0;
       for(char c:s.toCharArray()){
            if(c=='1'){
                count++;
                result=(result+count)%(int)M;
            }
            else{
                count=0;
            }
       } 
       return result;
    }
}