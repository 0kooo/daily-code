package day217.Test1;

import java.util.Arrays;

//LCP 33. 蓄水
class Solution {
    public int storeWater(int[] bucket, int[] vat) {
        int n = bucket.length;
        int max = Arrays.stream(vat).max().getAsInt();
        if(max == 0) return 0;
        int res = Integer.MAX_VALUE;
        for (int k = 1; k <= max && k < res; k++) {
            int t = 0;
            for (int i = 0; i < n; i++) {
                t += Math.max(0, (vat[i] + k - 1) / k - bucket[i]);
            }
            res = Math.min(res, t + k);
        }
        return res;
    }
}
