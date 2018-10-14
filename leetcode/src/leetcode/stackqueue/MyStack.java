package leetcode.stackqueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {


    private Queue<Integer> q1 = new ArrayDeque<>();
    private Queue<Integer> q2 = new ArrayDeque<>();

    public MyStack() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {

        if (q1.isEmpty() && q2.isEmpty()) {
            q1.add(x);
        } else {
            if (q1.isEmpty()) {
                q1.add(x);
                while (!q2.isEmpty()) {
                    q1.add(q2.poll());
                }
            } else {
                q2.add(x);
                while (!q1.isEmpty()) {
                    q2.add(q1.poll());
                }
            }

        }

    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (q1.isEmpty()) {
            return q2.poll();
        } else {
            return q1.poll();
        }
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (q1.isEmpty()) {
            return q2.peek();
        } else {
            return q1.peek();
        }
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }


}
