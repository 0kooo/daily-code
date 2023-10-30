package day332.Test3;

//1342. 将数字变成 0 的操作次数
class Solution {
    public int numberOfSteps(int num) {
        int res = 0;
        while (num != 0){
            if(num % 2 == 0) num /= 2;
            else num -= 1;
            res++;
        }
        return res;
    }
}
