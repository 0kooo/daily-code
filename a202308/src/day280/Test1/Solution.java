package day280.Test1;

//2591. 将钱分给最多的儿童
class Solution {
    public int distMoney(int money, int children) {
        money -= children;
        if(money < 0) return -1;
        int res = Math.min(money / 7, children);
        money -= res * 7;
        children -= res;
        if(money > 0 && children == 0 || money == 3 && children == 1) --res;
        return res;
    }
}
