package day364.Test3;

//2806. 取整购买后的账户余额
class Solution {
    public int accountBalanceAfterPurchase(int money) {
        return 100 - ((money + 5) / 10) * 10;
    }
}