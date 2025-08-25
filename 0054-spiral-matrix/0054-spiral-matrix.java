class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rw=matrix.length;
        int rl=matrix[0].length;
        ArrayList<Integer>ans=new ArrayList<>();
        int left=0;
        int right=rl-1;
        int top=0;
        int bottum=rw-1;
        while(left<=right && top<=bottum){
            //left-right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //top-bottum
            for(int i=top;i<=bottum;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //right-left
            if(top<=bottum){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottum][i]);
                }
                bottum--;
            }
            //bottum-top
            if(left<=right){
                for(int i=bottum;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}