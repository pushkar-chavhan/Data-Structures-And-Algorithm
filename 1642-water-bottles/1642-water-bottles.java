class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newBottle=empty/numExchange;
            total+=newBottle;
            empty=empty%numExchange+newBottle;
        }
        return total;
    }
}