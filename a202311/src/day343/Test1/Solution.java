package day343.Test1;

import java.lang.reflect.Array;
import java.util.Arrays;

//2300. 咒语和药水的成功对数
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length, m = potions.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            long t = (success + spells[i] - 1) / spells[i] - 1;
            res[i]  = m - binarySearch(potions, 0, m - 1, t);
        }
        return res;
    }

    private int binarySearch(int[] arr, int lo, int hi, long target) {
        int res = hi + 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] > target){
                res = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return res;
    }
}
