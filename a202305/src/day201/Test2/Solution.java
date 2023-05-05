package day201.Test2;

import java.util.ArrayDeque;
import java.util.Deque;

//856. 括号的分数
class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(0);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                deque.push(0);
            }else{
                int v = deque.pop();
                int top = deque.pop() + Math.max(v * 2, 1);
                deque.push(top);
            }
        }
        return deque.peek();
    }
}