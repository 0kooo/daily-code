package day162.Test3;

import java.util.Arrays;

//611. 有效三角形的个数
class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1, k = i; j < n; j++) {
                while ( k + 1 < n && nums[k + 1] < (nums[i] + nums[j])){
                    k++;
                }
                res += Math.max(k - j, 0);
            }
        }
        return res;
    }
}
