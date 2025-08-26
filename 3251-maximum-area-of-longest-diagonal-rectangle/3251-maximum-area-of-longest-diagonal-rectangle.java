class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxarea=0;
        double maxDiagonal=0;
        for(int i=0;i<dimensions.length;i++){
            int length=dimensions[i][0];
            int width=dimensions[i][1];
            double diagonal=Math.sqrt(length*length + width*width);
            int area=length*width;
            if(diagonal>maxDiagonal){
                maxDiagonal=diagonal;
                maxarea=area;
            }
            else if(diagonal==maxDiagonal){
                 maxarea=Math.max(maxarea,area);
            }
           
        }
        return maxarea;
    }
}