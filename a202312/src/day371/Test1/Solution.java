package day371.Test1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;

//2454. 下一个更大元素 IV
class Solution {
    public int[] secondGreaterElement(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < nums.length; i++) {
            while (!pq.isEmpty() && pq.peek()[0] < nums[i]){
                res[pq.poll()[1]] = nums[i];
            }
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                pq.offer(new int[]{nums[stack.peek()], stack.peek()});
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
