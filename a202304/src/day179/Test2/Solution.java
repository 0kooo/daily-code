package day179.Test2;

import java.util.*;

//1636. 按照频率将数组升序排序
class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        for (int key : map.keySet()) {
            queue.add(new int[]{map.get(key), key});
        }
        int index = 0;
        while (!queue.isEmpty()){
            int[] e = queue.poll();
            for (int i = 0; i < e[0]; i++) {
                res[index++] = e[1];
            }
        }
        return res;
    }
}
