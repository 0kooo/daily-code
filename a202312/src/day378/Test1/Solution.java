package day378.Test1;

import java.util.PriorityQueue;

//1962. 移除石子使总数最小
class Solution {
    public int minStoneSum(int[] piles, int k) {
        int res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for (int pile : piles) {
            pq.offer(pile);
        }
        for (int i = 0; i < k; i++) {
            int temp = pq.poll();
            temp -= temp / 2;
            pq.offer(temp);
        }
        while (!pq.isEmpty()){
            res += pq.poll();
        }
        return res;
    }
}