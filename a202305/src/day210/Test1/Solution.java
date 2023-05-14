package day210.Test1;

import java.util.HashMap;
import java.util.Map;

//1054. 距离相等的条形码
class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n = barcodes.length;
        if(n >= 2) return barcodes;
        Map<Integer, Integer> map = new HashMap<>();
        for (int barcode : barcodes) {
            map.put(barcode, map.getOrDefault(barcode, 0) + 1);
        }

        int evenIndex = 0, oddIndex = 1, halfn = n / 2;
        int[] res = new int[n];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            while (value > 0 && value <= halfn && oddIndex < n){
                res[oddIndex] = key;
                value--;
                oddIndex += 2;
            }
            while (value > 0){
                res[evenIndex] = key;
                value--;
                evenIndex += 2;
            }
        }
        return res;
    }
}
