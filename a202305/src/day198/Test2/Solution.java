package day198.Test2;

import java.util.HashSet;
import java.util.Set;

//2549. 统计桌面上的不同数字
class Solution {
    public int distinctIntegers(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        for (int i = 1; i <= n; i++) {
            for(int j = n; j >= 0; j--){
                if(j % i == 0){
                    set.add(i);
                }
            }
        }
        return set.size();
    }
}
