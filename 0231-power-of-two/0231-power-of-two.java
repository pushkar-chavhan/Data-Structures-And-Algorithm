class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if((n & (n-1))==0){//if n is power of 2 then n&n-1 must be 0
            return true;
        }
        return false;
    }
}