package day129.Text1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        boolean flag = true;
        for (int i = 0; i < suits.length - 1; i++) {
            if(suits[i] != suits[i + 1]){
                flag = false;
            }
        }
        if(flag) return "Flush";
        Map<Integer, Integer> map = new HashMap<>();
        for (int rank : ranks) {
            map.put(rank, map.getOrDefault(rank, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() >= 3) return "Three of a Kind";
        }
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() == 2) return "Pair";
        }
        return "High Card";
    }
}
/*
* class Solution {


    public String bestHand(int[] ranks, char[] suits) {
        int[] suit = new int[4], rank = new int[13];
        for (int i = 0; i < ranks.length; ++i) {
            suit[suits[i] - 'a']++;
            rank[ranks[i] - 1]++;
        }
        String ans = "High Card";
        for (int i : suit) if (i == 5) return "Flush";
        for (int i : rank) {
            if (i >= 3) ans = "Three of a Kind";
            else if (i == 2 && ans.equals("High Card")) ans = "Pair";
        }
        return ans;
    }
}*/
