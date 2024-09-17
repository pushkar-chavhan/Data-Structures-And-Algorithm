class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        //n=4=100
        //n=3=011
        //yancha and 000 yeto tr return true
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
}