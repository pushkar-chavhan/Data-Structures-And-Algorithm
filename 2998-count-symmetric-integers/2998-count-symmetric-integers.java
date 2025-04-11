class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int num=low;num<=high;num++){
            String s=String.valueOf(num);
            int len=s.length();
            if(len%2==0){
                int sum1=0;
                int sum2=0;
                for(int i=0;i<len/2;i++){
                    sum1+=s.charAt(i)-'0';
                 }
                for(int i=len/2;i<len;i++){
                    sum2+=s.charAt(i)-'0';
                }
                if(sum1==sum2){
                    count++;
                }
            }
        }
        return count;
    }
}