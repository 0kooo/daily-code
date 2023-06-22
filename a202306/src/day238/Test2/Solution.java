package day238.Test2;

import java.util.ArrayList;
import java.util.List;

//1389. 按既定顺序创建目标数组
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(index[i], nums[i]);
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}