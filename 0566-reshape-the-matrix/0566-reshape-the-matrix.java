class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat[0].length;
        int n=mat.length;
        if(m*n!=r*c){
            return mat;
        }
        int[][] reshapedMatrix=new int[r][c];
        int row=0;
        int col=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                reshapedMatrix[row][col]=mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }
        return reshapedMatrix;
    }
}