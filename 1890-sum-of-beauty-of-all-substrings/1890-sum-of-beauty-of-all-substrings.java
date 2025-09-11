class Solution {
    public int beautySum(String s) {
        // int sum=0;
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     int freq[]=new int[26];
        //     for(int j=i;j<n;j++){
        //         freq[s.charAt(j)-'a']++;
        //         int high=1;
        //         int low=n;
        //         for(int f:freq){
        //             if(f>0){
        //                 high=Math.max(high,f);
        //                 low=Math.min(low,f);
        //             }
        //         }
        //         sum+=high-low;
        //     }
        // }
        // return sum;



        //O(n^2)but optimized:
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int[]freq=new int[26];
            int maxfreq=0;
            for(int j=i;j<n;j++){
                int ind=s.charAt(j)-'a';
                freq[ind]++;
                maxfreq = Math.max(maxfreq, freq[ind]);
                int minfreq=Integer.MAX_VALUE;
                for(int f:freq){
                    if(f>0){
                        minfreq=Math.min(minfreq,f);
                    }
                }
                ans+=maxfreq-minfreq;
            }
            
        }
        return ans;
    }
}