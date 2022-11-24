package Text1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> MinS;
    public MinStack() {
        stack = new LinkedList<>();
        MinS = new LinkedList<>();
        MinS.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        MinS.push(Math.min(MinS.peek(),val));
    }

    public void pop() {
        stack.pop();
        MinS.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return MinS.peek();
    }
}
