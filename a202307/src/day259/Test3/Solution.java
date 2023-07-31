package day259.Test3;

import java.util.Arrays;

//274. H 指数
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0, i = citations.length - 1;
        while (i >= 0 && citations[i] > h){
            h++;
            i--;
        }
        return h;
    }
}
