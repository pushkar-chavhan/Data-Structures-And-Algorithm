class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        // Map<Integer,List<Integer>>map=new HashMap<>();
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         int key=i+j;
        //         map.putIfAbsent(key,new ArrayList<>());
        //         map.get(key).add(mat[i][j]);
        //     }
        // }
        // List<Integer>resultList=new ArrayList<>();
        // boolean flip=true;
        // for(int k=0;k<=m+n-2;k++){//here k=i+j |m+n-2=3+3-2=4=key
        //     List<Integer>diagonal=map.get(k);
        //     if(diagonal==null){
        //         continue;
        //     }
        //     if(flip){
        //         Collections.reverse(diagonal);//first flip->no flip->flip....
        //     }
        //     resultList.addAll(diagonal);
        //     flip=!flip;
        // }
        // int result[]=new int[resultList.size()];
        // for(int i=0;i<resultList.size();i++){
        //     result[i]=resultList.get(i);
        // }
        // return result;
        int result[]=new int[m*n];
        int row=0,col=0;
        for(int i=0;i<m*n;i++){
            result[i]=mat[row][col];
            if((row+col)%2==0){//for upward arrow
                if(col==n-1)row++;
                else if(row==0)col++;
                else{
                    row--;
                    col++;
                }
            }
            else{            //for downward arrow
                if(row==m-1)col++;
                else if(col==0)row++;
                else{
                    row++;col--;
                }
            }
        }
        return result;
    }
}