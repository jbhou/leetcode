package leetcode;

import java.util.Stack;

public class MinStack155 {


    private Stack<Integer> stack;

    /**
     * initialize your data structure here.
     */

//
//    设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
//
//    push(x) -- 将元素 x 推入栈中。
//    pop() -- 删除栈顶的元素。
//    top() -- 获取栈顶元素。
//    getMin() -- 检索栈中的最小元素。
//    示例:
//
//    MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//            minStack.pop();
//minStack.top();      --> 返回 0.
//            minStack.getMin();   --> 返回 -2.
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/min-stack
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public MinStack155() {
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