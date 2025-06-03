class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed=1;
        int maxSpeed=0;
        for(int pile:piles){
            maxSpeed=Math.max(maxSpeed,pile);
        }
        int result=maxSpeed;
        while(minSpeed<=maxSpeed){
            int mid=minSpeed+(maxSpeed-minSpeed)/2;
           
            if(canEatInTime(piles,h,mid)){
                result=mid;
                maxSpeed=mid-1;
            }else{
                minSpeed=mid+1;
            }
        }
        return result;
    }
   private boolean canEatInTime(int[] piles, int h, int speed) {
    long hours = 0; // use long to avoid overflow
    for (int pile : piles) {
        hours += (pile + speed - 1L) / speed; // integer ceiling without Math.ceil
        if (hours > h) return false; // early exit
    }
    return hours <= h;
}

}