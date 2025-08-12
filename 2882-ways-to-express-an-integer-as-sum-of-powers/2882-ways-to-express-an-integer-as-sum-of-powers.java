class Solution {
    private final int m=1000000007;
    private int t[][]=new int[301][301];
    private int solve(int n,int num,int x){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int  currentPower=(int)Math.pow(num,x);
        if(currentPower>n){
                return 0;
        }
        if(t[n][num]!=-1){
            return t[n][num];

        }
        int take=solve(n-currentPower,num+1,x);
        int skip=solve(n,num+1,x);
        return t[n][num]=(take+skip)%(int)m;
    }
    public int numberOfWays(int n, int x) {
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                t[i][j]=-1;
            }
        }
        return solve(n,1,x);
    }
}