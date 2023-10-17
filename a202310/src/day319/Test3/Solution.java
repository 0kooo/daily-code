package day319.Test3;

import java.util.HashSet;
import java.util.Set;

//869. 重新排序得到 2 的幂
class Solution {
    Set<String> set = new HashSet<>();
    public boolean reorderedPowerOf2(int n) {
        getAllPosition();
        return set.contains(count(n));
    }

    private void getAllPosition() {
        for (int i = 1; i <= 1e9; i <<= 1) set.add(count(i));
    }

    private String count(int n) {
        char[] res = new char[10];
        while (n > 0){
            res[n % 10]++;
            n /= 10;
        }
        return new String(res);
    }
}
