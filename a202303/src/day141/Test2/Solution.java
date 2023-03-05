package day141.Test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return Objects.equals(map.get('U'), map.get('D')) && Objects.equals(map.get('L'), map.get('R'));
    }
}

/*
* class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') y++;
            if (c == 'D') y--;
            if (c == 'L') x++;
            if (c == 'R') x--;
        }
        return x == 0 && y == 0;
    }
}
* */
