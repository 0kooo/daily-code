package day363.Test3;

//2739. 总行驶距离
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int res = 0;
        while (mainTank >= 5){
            res += (5 * 10);
            mainTank -= 5;
            if(additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }
        if(mainTank > 0) res += ( mainTank * 10);
        return res;
    }
}