package day320.Test1;

import java.util.Arrays;
import java.util.PriorityQueue;

//2530. 执行 K 次操作后的最大分数
class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pd = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            pd.offer(num);
        }
        long res = 0;
        for (int i = 0; i < k; i++) {
            int x = pd.poll();
            res += x;
            pd.offer((x + 2) / 3);
        }
        return res;
        //超时，排队时间太长
        /*long res = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            Arrays.sort(nums);
            res += nums[n - 1];
            nums[n - 1] = (nums[n - 1] + 2) / 3;
        }
        return res;*/
    }
}
