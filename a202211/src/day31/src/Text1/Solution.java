package Text1;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        int length = tokens.length;
        for (int i = 0; i < length; i++) {
            String token = tokens[i];
            if(isNumber(token)){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (token){
                    case "+" -> stack.push(num1 + num2);
                    case "-" -> stack.push(num1 - num2);
                    case "*" -> stack.push(num1 * num2);
                    case "/" -> stack.push(num1 / num2);
                    default -> {}
                }
            }
        }
        return stack.pop();
    }

    public boolean isNumber(String num){
        return !("+".equals(num) || "-".equals(num) || "*".equals(num) || "/".equals(num));
    }
}
