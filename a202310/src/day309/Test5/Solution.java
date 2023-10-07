package day309.Test5;

//1688. 比赛中的配对次数
class Solution {
    public int numberOfMatches(int n) {
        int res = 0;
        while (n != 1){
            if(n % 2 == 1){
                res += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }else{
                res += n / 2;
                n /= 2;
            }
        }
        return res;
    }
}
