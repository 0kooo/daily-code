package day362.Test3;

//2769. 找出最大的可达成数字
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        return num + (t << 1);
    }
}