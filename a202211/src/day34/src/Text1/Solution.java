package Text1;

import java.util.Deque;
import java.util.LinkedList;

//此方法超时了
/*
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            flag = true;
            for (int j = i + 1; j < len; j++) {
                if(temperatures[i] < temperatures[j]){
                    temperatures[i] = j - i;
                    flag = false;
                    break;
                }
            }
            if(flag) temperatures[i] = 0;
        }
        temperatures[len - 1] = 0;
        return temperatures;
    }
}*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            int temp = temperatures[i];
            while(!stack.isEmpty() && temp > temperatures[stack.peek()]){
                int index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        return res;
    }
}