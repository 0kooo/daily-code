package day384.Test1;

import java.util.*;

//2009. 使数组连续的最少操作数
class Solution {
    public int minOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int n = nums.length;
        int res = n;
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            int left = list.get(i);
            int right = left + n - 1;
            while (j < list.size() && list.get(j) <= right){
                res = Math.min(res, n - (j - i + 1));
                j++;
            }
        }
        return res;
    }
}