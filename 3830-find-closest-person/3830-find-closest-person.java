class Solution {
    public int findClosest(int x, int y, int z) {
        int p1diff=Math.abs(z-x);
        int p2diff=Math.abs(y-z);
        if(p1diff==p2diff){
            return 0;
        }
        else if(p1diff<p2diff){
            return 1;
        }
        return 2;
    }
}