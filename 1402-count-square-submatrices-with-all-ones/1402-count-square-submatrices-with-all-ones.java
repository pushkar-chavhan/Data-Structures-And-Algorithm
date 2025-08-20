class Solution {
    private int solve(int i,int j,int matrix[][],int t[][]){
        if(i>=matrix.length  || j>=matrix[0].length ){
            return 0;
        }
        if(matrix[i][j]==0){
            return 0;
        }
        if(t[i][j]!=-1){
            return t[i][j];
        }
        int right=solve(i,j+1,matrix,t);
        int down=solve(i+1,j,matrix,t);
        int dia=solve(i+1,j+1,matrix,t);

        return t[i][j]=1+Math.min(Math.min(right,down),dia);
    }
    public int countSquares(int[][] matrix) {
        int result=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int t[][]=new int [m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                t[i][j]=-1;
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result+=solve(i,j,matrix,t);
            }
        }
        return result;





        //Bottum-up method;

        // int m=matrix.length;
        // int n=matrix[0].length;
        // int t[][]=new int[m+1][n+1];
        // int result=0;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0 || j==0){
        //             t[i][j]=matrix[i][j];
        //         }
        //         else{
        //             if(matrix[i][j]==1){
        //                 t[i][j]=1+Math.min(t[i-1][j],Math.min(t[i-1][j-1],t[i][j-1]));
        //             }
        //         }
        //          result+=t[i][j];
        //     }    
        // }
        // return result;

        //recursion + memoization

    }
}