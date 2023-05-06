package day202.Test1;

import java.util.HashMap;
import java.util.Map;

//1419. 数青蛙
class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        if(croakOfFrogs.length() % 5 != 0){
            return -1;
        }
        int res = 0, frogNum = 0;
        int[] arr = new int[4];
        Map<Character, Integer> map = new HashMap<>();
        map.put('c', 0);
        map.put('r', 1);
        map.put('o', 2);
        map.put('a', 3);
        map.put('k', 4);
        for (int i = 0; i < croakOfFrogs.length(); i++) {
            char c = croakOfFrogs.charAt(i);
            int t = map.get(c);
            if(t == 0){
                arr[t]++;
                frogNum++;
                if(frogNum > res){
                    res = frogNum;
                }
            }else{
                if(arr[t - 1] == 0){
                    return -1;
                }
                arr[t - 1]--;
                if(t == 4){
                    frogNum--;
                }else{
                    arr[t]++;
                }
            }
        }
        if(frogNum > 0){
            return -1;
        }
        return res;
    }
}
