package day244.Test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//786. 第 K 个最小的素数分数
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<int[]> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                list.add(new int[]{arr[i], arr[j]});
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] * o2[1] - o2[0] * o1[1];
            }
        });
        return list.get(k - 1);
    }
}
