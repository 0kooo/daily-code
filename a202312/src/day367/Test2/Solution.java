package day367.Test2;

//2391. 收集垃圾的最少总时间
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int res = 0;
        int lasta = 0, lastb = 0, lastc = 0;
        for (int i = 0; i < garbage.length; i++) {
            res += garbage[i].length();
            for (char c : garbage[i].toCharArray()) {
                if(c == 'M') lasta = i;
                else if(c == 'P') lastb = i;
                else lastc = i;
            }
        }
        for (int i = 0; i < travel.length; i++) {
            if(lasta > i) res += travel[i];
            if(lastb > i) res += travel[i];
            if(lastc > i) res += travel[i];
        }
        return res;
    }
}
