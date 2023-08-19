package day276.Test3;

//397. 整数替换
class Solution {
    public int integerReplacement(int n) {
        int res = 0;
        while (n != 1){
            if(n % 2 == 0){
                n /= 2;
                res++;
            }else if(n % 4 == 1){
                res += 2;
                n /= 2;
            }else{
                if(n == 3){
                    n = 1;
                }else{
                    n = n / 2 + 1;
                }
                res += 2;
            }
        }
        return res;
    }
}
