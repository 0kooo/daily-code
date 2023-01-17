package day102.Text1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countNicePairs(int[] nums) {
        final int MOD = 1000000007;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int temp = num;
            int j = 0;
            while(temp != 0){
                j = j * 10 + temp % 10;
                temp /= 10;
            }
            res = (res + map.getOrDefault(num - j, 0)) % MOD;
            map.put(num - j, map.getOrDefault(num - j, 0) + 1);
        }
        return res;
    }
}
