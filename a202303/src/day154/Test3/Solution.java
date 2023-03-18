package day154.Test3;

import java.util.Arrays;

//1646. 获取生成数组中的最大值
class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0) return 0;
        int[] nums = new int[n + 1];
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i / 2] + i % 2 * nums[(i / 2) + 1];
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}
