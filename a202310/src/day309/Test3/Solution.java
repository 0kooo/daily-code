package day309.Test3;

import java.util.LinkedList;

class Solution {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int num = 0;
        LinkedList<Integer> stack1 = new LinkedList<>();
        LinkedList<String> stack2 = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if(c == '['){
                stack1.add(num);
                stack2.add(res.toString());
                num = 0;
                res = new StringBuilder();
            }else if(c == ']'){
                StringBuilder temp = new StringBuilder();
                int length = stack1.removeLast();
                for (int i = 0; i < length; i++) temp.append(res);
                res = new StringBuilder(stack2.removeLast() + temp);
            }else if(c >= '0' && c <= '9') num = num * 10 + (c - '0');
            else res.append(c);
        }
        return res.toString();
    }
}
