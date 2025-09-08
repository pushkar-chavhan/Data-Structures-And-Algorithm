class Solution {
    static boolean isContainZero(int a){
        String  str=String.valueOf(a);
        for(char c:str.toCharArray()){
            if(c=='0'){
                return true;
            }
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int []result=new int[2];
        // for(int i=1;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         if(j+i==n){
        //             result[0]=i;
        //             result[1]=j;
        //         }
        //     }
        // }
        // return result;
        for(int i=1;i<n;i++){
            int a =i;
            int b=n-i;
            if(!isContainZero(a)  && !isContainZero(b) && a+b==n ){
                result[0]=a;
                result[1]=b;
            }
        }
        return result;
    }
}