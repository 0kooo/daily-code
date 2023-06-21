package day237.Test2;

import java.util.ArrayList;
import java.util.List;

//1018. 可被 5 整除的二进制前缀
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            pre = ((pre << 1) + nums[i]) % 5;
            res.add(pre == 0);
        }
        return res;
    }
}
