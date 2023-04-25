package day192.Test1;

import java.util.Arrays;

//2418. 按身高排序
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] res = new String[n];
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        Arrays.sort(index, (a, b) -> heights[b] - heights[a]);
        for (int i = 0; i < n; i++) {
            res[i] = names[index[i]];
        }
        return res;
    }
}
