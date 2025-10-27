class Solution {
    public int totalMoney(int n) {
       int result=0;
       int mondayMon=1;
       while(n>0){
        int money=mondayMon;
        for(int day=1;day<=Math.min(n,7);day++){
            result+=money;
            money++;
        }
        n-=7;
        mondayMon++;
       }
       return result;
    }
}