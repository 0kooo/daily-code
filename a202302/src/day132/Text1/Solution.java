package day132.Text1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> res = new ArrayList<>();
        res.add(start);
        for (int i = 1; i <= n; i++) {
            int m = res.size();
            for (int j = m - 1; j >= 0; j--) {
                res.add(((res.get(j) ^ start) | (1 << (i - 1))) ^ start);
            }
        }
        return res;
    }
}
