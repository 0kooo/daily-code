package day224.Test1;

import java.util.ArrayDeque;
import java.util.Deque;

//1130. 叶值的最小代价生成树
class Solution {
    public int mctFromLeafValues(int[] arr) {
        int res = 0;
        Deque<Integer> stk = new ArrayDeque<>();
        for (int x : arr) {
            while (!stk.isEmpty() && stk.peek() <= x){
                int y = stk.pop();
                if(stk.isEmpty() || stk.peek() > x){
                    res += y * x;
                }else{
                    res += stk.peek() * y;
                }
            }
            stk.push(x);
        }
        while (stk.size() >= 2){
            int x = stk.pop();
            res += stk.peek() * x;
        }
        return res;
    }
}