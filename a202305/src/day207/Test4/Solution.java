package day207.Test4;

//371. 两整数之和
class Solution {
    public int getSum(int a, int b) {
        /*while (b != 0){
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;*/

        int res = 0;
        if(a > 0){
            for (int i = 0; i < a; i++) {
                res++;
            }
            if(b > 0){
                for (int i = 0; i < b; i++) {
                    res++;
                }
            }else{
                for (int i = 0; i < Math.abs(b); i++) {
                    res--;
                }
            }
        }else if(a < 0){
            for (int i = 0; i < Math.abs(a); i++) {
                res--;
            }
            if(b > 0){
                for (int i = 0; i < b; i++) {
                    res++;
                }
            }else{
                for (int i = 0; i < Math.abs(b); i++) {
                    res--;
                }
            }
        }
        return res;
    }
}
