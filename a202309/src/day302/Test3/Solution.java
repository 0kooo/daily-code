package day302.Test3;

//2169. 得到 0 的操作数
class Solution {
    public int countOperations(int num1, int num2) {
        int res = 0;
        while (num1 != 0 && num2 != 0){
            if(num1 >= num2){
                num1 = num1 - num2;
            }else{
                num2 = num2 - num1;
            }
            res++;
        }
        return res;
    }
}