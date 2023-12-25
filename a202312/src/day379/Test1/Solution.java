package day379.Test1;

import java.util.ArrayList;
import java.util.List;

//1276. 不浪费原料的汉堡制作方案
class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if(tomatoSlices % 2 == 1 || tomatoSlices < cheeseSlices * 2 || tomatoSlices > cheeseSlices * 4) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        res.add(tomatoSlices / 2 - cheeseSlices);
        res.add(cheeseSlices * 2 - tomatoSlices / 2);
        return res;
    }
}