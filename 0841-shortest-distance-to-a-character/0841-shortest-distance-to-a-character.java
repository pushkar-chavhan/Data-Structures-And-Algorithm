class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            int mindist=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(s.charAt(j)==c){
                    mindist=Math.min(mindist,Math.abs(i-j));

                }
            }
            arr[i]=mindist;
        }
        return arr;
    }
}