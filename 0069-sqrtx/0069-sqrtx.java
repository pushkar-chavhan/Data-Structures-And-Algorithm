class Solution {
    public int mySqrt(int x) {
        // int i=1;
        // while(i*i<=x){
        //     i++;
        // }
        // return i-1;
        int low=1, high=x, ans=0;
        if(x==0 ||x==1) return x;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sqr=(long)mid*mid;
            if(sqr==x){
                return mid;
            }
            else if(sqr<x){
                ans=mid;
                low=mid+1;
            }
            else {
                high =mid-1;
            }
        }
        return ans;
    }
}