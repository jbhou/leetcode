package leetcode;

import java.util.Stack;

public class MinStack {


    private Stack<Integer> stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {

        if (stack.size() == 0) {
            stack.push(x);
            stack.push(x);
        } else {
            int min = stack.peek();
            min = min < x ? min : x;
            stack.push(x);
            stack.push(min);
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        int min = stack.pop();
        int top = stack.peek();
        stack.push(min);
        return top;
    }


    public int getMin() {
        return stack.peek();
    }
}