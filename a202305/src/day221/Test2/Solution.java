package day221.Test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1200. 最小绝对差
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length, min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int dis = arr[i + 1] - arr[i];
            if(dis < min){
                res.clear();
                min = dis;
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
                res.add(temp);
            }else if(min == dis){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
                res.add(temp);
            }
        }
        return res;
    }
}
