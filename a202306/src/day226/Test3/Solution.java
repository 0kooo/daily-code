package day226.Test3;

import java.util.ArrayList;
import java.util.List;

//1431. 拥有最多糖果的孩子
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            res.add(candy + extraCandies >= max);
        }
        return res;
    }
}
