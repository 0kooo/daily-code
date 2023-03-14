package day150.Test3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = Arrays.stream(aliceSizes).sum();
        int sumB = Arrays.stream(bobSizes).sum();
        int delta = (sumA - sumB) / 2;
        Set<Integer> set = new HashSet<>();
        for (int a : aliceSizes) {
            set.add(a);
        }
        int[] ret = new int[2];
        for (int b : bobSizes) {
            int x = b + delta;
            if(set.contains(x)){
                ret[0] = x;
                ret[1] = b;
            }
        }
        return ret;
    }
}
