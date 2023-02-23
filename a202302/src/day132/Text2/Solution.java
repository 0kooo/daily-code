package day132.Text2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        for (int i = 0; i < n; i++) {
            if(nums[i] <= n){
                res.add(i + 1);
            }
        }
        return res;
    }
}
