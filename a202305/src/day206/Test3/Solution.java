package day206.Test3;

import java.util.Arrays;

//908. 最小差值 I
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        return max - min <= 2 * k ? 0 : max - min - 2 * k;
    }
}
