package day164.Test2;

//2511. 最多可以摧毁的敌人城堡数目
class Solution {
    public int captureForts(int[] forts) {
        int res = 0;
        int pre = 0;
        for (int i = 0; i < forts.length; i++) {
            if(forts[i] == 1){
                if(forts[pre] == -1){
                    res = Math.max(res, i - pre - 1);
                }
                pre = i;
            }
            if(forts[i] == -1){
                if(forts[pre] == 1){
                    res = Math.max(res, i - pre - 1);
                }
                pre = i;
            }
        }
        return res;
    }
}
