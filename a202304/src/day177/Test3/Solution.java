package day177.Test3;


import java.util.HashSet;
import java.util.Set;

//1496. 判断路径是否相交
class Solution {
    public boolean isPathCrossing(String path) {
        Set<Integer> set = new HashSet<>();
        int x = 0, y = 0;
        set.add(getHash(x, y));
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            switch (c){
                case 'N': --x; break;
                case 'S': ++x; break;
                case 'W': --y; break;
                case 'E': ++y; break;
            }
            int hash = getHash(x, y);
            if(!set.add(hash)){
                return true;
            }
        }
        return false;
    }

    private int getHash(int x, int y) {
        return x * 20001 + y;
    }
}
