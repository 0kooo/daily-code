package day268.Test1;

//1217. 玩筹码
class Solution {
    public int minCostToMoveChips(int[] position) {
        int num1 = 0, num2 = 0;
        for (int pos : position) {
            if((pos & 1) != 0) num1++;
            else num2++;
        }
        return Math.min(num2, num1);
    }
}
