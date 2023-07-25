package day254.Test1;

import java.util.PriorityQueue;

//2208. 将数组和减半的最少操作次数
class Solution {
    public int halveArray(int[] nums) {
        int res = 0, n = nums.length;
        double sum1 = 0.0, sum2 = 0.0;
        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
        for (int num : nums) {
            sum1 += num;
            pq.offer((double) num);
        }
        while (sum2 < (sum1 / 2)){
            double max = pq.poll();
            sum2 += max / 2;
            pq.offer(max / 2);
            res++;
        }
        return res;
    }
}
