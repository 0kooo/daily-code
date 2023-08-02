package day260.Test1;

import java.util.HashSet;
import java.util.Set;

//822. 翻转卡片游戏
class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < fronts.length; i++) {
            if(fronts[i] == backs[i]) set.add(fronts[i]);
        }
        int res = 3000;
        for (int front : fronts) {
            if(res > front && !set.contains(front)) res = front;
        }
        for (int back : backs) {
            if(res > back && !set.contains(back)) res = back;
        }
        return res % 3000;
    }
}
