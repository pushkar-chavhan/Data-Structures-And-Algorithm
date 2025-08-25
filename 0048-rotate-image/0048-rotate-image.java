class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        //optimal transpose +reverse
        for(int i=0;i<n;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse the matrix
         for(int i=0;i<n;i++){
            int start=0;
            int end=matrix.length-1;
            while(start<end){
              int  temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
        //brute usingextra space
        // int [][]rotated=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         rotated[j][n-i-1]=matrix[i][j];//n-1-i is beauce i is same 
        //     }
        // }
        // for(int i=0;i<rotated.length;i++){
        //     for(int j=0;j<rotated.length;j++){
        //          matrix[i][j]=rotated[i][j];
        //     }
        // }
    }
}