package day149.Test3;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

class Solution {
    int[] nums = {2, 3, 5};
    public int nthUglyNumber(int n) {
        Set<Long> set = new HashSet<>();
        Queue<Long> pq = new PriorityQueue<>();
        set.add(1L);
        pq.add(1L);
        for (int i = 1; i <= n; i++) {
            long x = pq.poll();
            if(i == n) return (int)x;
            for (int num : nums) {
                long t = num * x;
                if(!set.contains(t)){
                    set.add(t);
                    pq.add(t);
                }
            }
        }
        return -1;
    }
}
