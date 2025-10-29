class Solution {
    public int smallestNumber(int n) {
        double ans=0;
        for(int i=1;i<=n;i++){
            double power=Math.pow(2,i);
            if(power>n){
                ans=power-1;
                break;
            }
        }
        return (int)ans;
    }
}