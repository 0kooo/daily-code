package day179.Test3;

import java.util.HashMap;
import java.util.Map;

//1640. 能否连接形成数组
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int n = arr.length,  m = pieces.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(pieces[i][0], i);
        }
        for (int i = 0; i < n;) {
            if(!map.containsKey(arr[i])){
                return false;
            }
            int j = map.get(arr[i]), len = pieces[j].length;
            for (int k = 0; k < len; k++) {
                if(arr[i + k] != pieces[j][k]){
                    return false;
                }
            }
            i = i + len;
        }
        return true;
    }
}
