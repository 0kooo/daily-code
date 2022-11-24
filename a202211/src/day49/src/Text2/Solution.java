package Text2;

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        for (int num : nums) {
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                int val = map.get(num);
                map.put(num, val + 1);
            }
        }
        PriorityQueue<int[]>  queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(queue.size() == k){
                if(queue.peek()[1] < value){
                    queue.poll();
                    queue.offer(new int[]{key, value});
                }
            }else{
                queue.offer(new int[]{key, value});
            }

        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[1];
        }
        return res;
    }
}
//我自己写的, 但测试没有全部通过
// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer , Integer> map = new HashMap<>();
//         for (int num : nums) {
//             if(!map.containsKey(num)){
//                 map.put(num, 1);
//             }else{
//                 int val = map.get(num);
//                 map.put(num, val + 1);
//             }
//         }
//         ArrayList<Integer> list = new ArrayList<>();
//         Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//         for (Map.Entry<Integer, Integer> entry : entries) {
//             list.add(entry.getValue());
//         }
//         Arrays.sort(list.toArray());
//         int[] res = new int[k];
//         for(int i = 0; i < k; i++){
//             int val = list.get(i);
//             for (Map.Entry<Integer, Integer> entry : entries) {
//                 if(entry.getValue() == val){
//                     res[i] = entry.getKey();
//                 }
//             }
//         }
//         return res;
//     }
// }