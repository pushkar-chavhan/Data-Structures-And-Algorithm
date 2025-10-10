// class Solution {
//     int n;
//     int K;
//     private int solve(int i,int[]energy,int []t){
//         if(i>=n){
//             return 0;
//         }
//         if(t[i]!=Integer.MIN_VALUE){
//             return t[i];
//         }
//         t[i]=energy[i]+solve(i+K,energy,t);
//         return t[i];
//     }
//     public int maximumEnergy(int[] energy, int k) {
//         n=energy.length;
//         K=k;
//         int[]t=new int[n];
//         Arrays.fill(t,Integer.MIN_VALUE);
//         int maxEnergy=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             maxEnergy=Math.max(maxEnergy,solve(i,energy,t));
//         }
//         return maxEnergy;
//     }
// }
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int max = Integer.MIN_VALUE;
        for (int i=energy.length-k;i<energy.length;i++) {
            max = Math.max(max, energy[i]);
        }
        
        for (int i=energy.length-k-1;i>=0;i--) {
            energy[i] += energy[i+k];
            max = Math.max(max, energy[i]);
        }
        return max;
        
    }
}