package day280.Test3;

import java.util.*;

//846. 一手顺子
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n % groupSize != 0) return false;
        Arrays.sort(hand);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : hand) {
            if(!map.containsKey(i)) continue;
            for (int j = 0; j < groupSize; j++) {
                int num = i + j;
                if(!map.containsKey(num)) return false;
                map.put(num, map.get(num) - 1);
                if(map.get(num) == 0) map.remove(num);
            }
        }
        return true;
    }
}
