package day253.Test2;

//2535. 数组元素和与数字和的绝对差
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int num : nums) {
            sum1 += num;
            while (num != 0){
                int ge = num % 10;
                sum2 += ge;
                num /= 10;
            }
        }
        return Math.abs(sum1 - sum2);
    }
}
