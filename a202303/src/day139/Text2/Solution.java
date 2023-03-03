package day139.Text2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        int res = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            for (Map.Entry<Character, Integer> entry : entries) {
                if(entry.getKey() == c){
                    res += entry.getValue();
                }
            }
        }
        return res;
    }
}
/*
* class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(int i =0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
* */