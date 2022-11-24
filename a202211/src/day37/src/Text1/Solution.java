package Text1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] arr = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(arr);
            int d = arr[1] - arr[0];
            boolean flag = true;
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j + 1] - arr[j] != d) {
                    flag = false;
                    break;
                }
            }
            res.add(flag);
        }
        return res;
    }
}
