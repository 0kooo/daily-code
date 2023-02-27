package day135.Text1;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        int n = candyType.length;
        return Math.min((n / 2), set.size());
    }
}
