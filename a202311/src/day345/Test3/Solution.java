package day345.Test3;

//1518. 换水问题
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles, kong = numBottles;
        while (kong >= numExchange){
            int exchange = kong / numExchange;
            res += exchange;
            kong %= numExchange;
            kong += exchange;
        }
        return res;
    }
}
