package day183.Test1;

//740. 删除并获得点数
class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] sum = new int[max + 1];
        for (int num : nums) {
            sum[num] += num;
        }
        return rob(sum);
    }

    private int rob(int[] sum) {
        int first = sum[0], second = Math.max(sum[0], sum[1]);
        for (int i = 2; i < sum.length; i++) {
            int temp = second;
            second = Math.max(first + sum[i], second);
            first = temp;
        }
        return second;
    }
}