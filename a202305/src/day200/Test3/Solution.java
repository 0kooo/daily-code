package day200.Test3;

import java.util.ArrayDeque;
import java.util.Deque;

//1544. 整理字符串
class Solution {
    public String makeGood(String s) {
        int n = s.length();
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean flag = true;
            if(!deque.isEmpty()){
                if(c - deque.peek() == 32 || deque.peek() - c == 32){
                    flag = false;
                    deque.pop();
                }
            }
            if(flag)deque.push(c);
        }
        StringBuilder res = new StringBuilder();
        for (Character c : deque) {
            res.append(c);
        }
        return res.reverse().toString();
    }
}
