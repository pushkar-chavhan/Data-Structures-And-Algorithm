class Solution {
    private int subarraycount1(int []rowMask){
        int consecutive=0;
        int subArcount=0;
        for(int val:rowMask){
            if(val==0){
                consecutive=0;
            }
            else{
                consecutive++;
            }
            subArcount+=consecutive;
        }
        return subArcount;
    }
    public int numSubmat(int[][] mat) {
        int row=mat.length;
        int cols=mat[0].length;
        int totalCount=0;
        for(int topRow=0;topRow<row;topRow++){
            int []rowMask=new int[cols];
            for(int i=0;i<cols;i++){
                rowMask[i]=1;
            }
            for(int bottumRow=topRow;bottumRow<row;bottumRow++){
                for(int col=0;col<cols;col++){
                    rowMask[col]=rowMask[col]&mat[bottumRow][col];
                }
                totalCount+=subarraycount1(rowMask);
            }
           
        }
        return totalCount;
    }
}