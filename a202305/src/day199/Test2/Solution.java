package day199.Test2;

import java.util.ArrayDeque;
import java.util.Deque;

//1021. 删除最外层的括号
class Solution {
    public String removeOuterParentheses(String s) {
        char[] arr = s.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        for (char c : arr) {
            if(c == ')'){
                deque.pop();
            }
            if(!deque.isEmpty()){
                res.append(c);
            }
            if(c == '('){
                deque.push(c);
            }
        }
        return res.toString();
    }
}
