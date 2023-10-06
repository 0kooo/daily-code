package day308.Test4;

//2220. 转换数字的最少位翻转次数
class Solution {
    public int minBitFlips(int start, int goal) {
        int num = 0;
        while (start > 0 || goal > 0){
            if((start & 1) != (goal & 1)) num++;
            start >>=1;
            goal >>= 1;
        }
        return num;
    }
}