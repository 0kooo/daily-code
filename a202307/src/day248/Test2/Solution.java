package day248.Test2;

//1979. 找出数组的最大公约数
class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        int res = 0;
        for (int i = 1; i <= min; i++){
            if(max % i == 0 && min % i == 0){
                res = Math.max(res, i);
            }
        }
        return res;
    }
}