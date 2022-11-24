package Text1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solution {
    private static final Map<Character,Character> map = new HashMap<>(){{
       put('{','}');
       put('[',']');
       put('(',')');
       put('?','?');
    }};
    public boolean isValid(String s) {
        int len = s.length();
        if(len % 2 == 1) return false;
        if(len > 0 && !map.containsKey(s.charAt(0))) return false;
        LinkedList<Character> stack = new LinkedList<>(){{
            add('?');
        }};
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)) stack.addLast(c);
            else if(map.get(stack.removeLast()) != c) return false;
        }
        return stack.size() == 1;

    }
}
