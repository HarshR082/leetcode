class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int ans = numBottles;
       while(numBottles>=numExchange){
        int exc = numBottles/numExchange;
        ans = ans+exc;
        int rest = numBottles%numExchange;
        numBottles = exc+rest;
       }
       return ans;
    }
}