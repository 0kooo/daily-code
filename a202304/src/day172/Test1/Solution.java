package day172.Test1;

//2427. 公因子的数目
class Solution {
    public int commonFactors(int a, int b) {
        int res = 0;
        for(int i = 1; i <= (Math.max(a, b) / 2); i++){
            if(a % i == 0 && b % i == 0){
                res++;
            }
        }
        if(a == b) res++;
        return res;
    }
}
